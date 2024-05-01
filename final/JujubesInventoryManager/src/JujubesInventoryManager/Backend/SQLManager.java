package JujubesInventoryManager.Backend;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class SQLManager {
//    main tables -> 
//          -> category
//          -> stock
//          -> transaction
//          -> inventory

    
// Defining essential attributes for sql Connection
    private static final String url = "jdbc:mysql://localhost:3306/cloth_shop_test";
    private static final String userName = "root";
    private static final String password = "lamidu@123";
    protected static Connection connection;
    protected static PreparedStatement statement;
    
    
// main functions >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //  sets connection between the application and the mysql server 
    protected static Connection getConnection()throws SQLException{
        if (connection == null || connection.isClosed()) {connection = DriverManager.getConnection(url,userName,password);}
        return connection;
    } 
    //  executes any number of cols in tables not multiple raws at a time. 
    private static int updateTable(String query, Object[] array) {
        int generatedKey = -1;
        try{
            statement = getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            int i=1;
            for (Object object : array) {
                if (object instanceof String) statement.setString(i,(String) object);
                else if (object instanceof Double) statement.setDouble(i,(Double) object);
                else if (object instanceof Integer)statement.setInt(i,(Integer) object);
                else System.out.println("  unknown data type!!!");
                i++;     
            }
            int updatedRowsCount = statement.executeUpdate();
            System.out.println(updatedRowsCount+" Rows has been updated");
            //auto generated keys
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {generatedKey = resultSet.getInt(1);}    
            connection.close();
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            System.out.println("\n---- stack trace ----");
            exc.printStackTrace();
        }
        return generatedKey;   
    }
    
// sub functions >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   
    //gets all the stock in the inventory
    public static List<Object[]> getAvailableItem(){
        String query = "select inv.iid,inv.sid,cat.cname,stk.size,col.Color,inv.squantity,stk.selling_price \n" +
            "from inventory inv \n" +
            "join stock stk on inv.sid = stk.sid \n" +
            "join category cat on stk.cid = cat.cid \n" +
            "join colors col on stk.color_id = col.color_id\n" +
            "order by inv.iid ;";
        List<Object[]> rows = new ArrayList<Object[]>(); 
        try{
            statement = getConnection().prepareStatement(query);
            ResultSet results = statement.executeQuery();
            while(results.next()){
                Object[] row = {results.getInt("iid"),results.getInt("sid"),results.getString("cname"),results.getString("size"),results.getString("Color"),results.getInt("squantity"),results.getDouble("selling_price")};
                rows.add(row);
            }
            return rows;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            return null;
        }
    } 
    //gets availability in inventory
    public static int isItemAvailable(int sid,int count){
        String query = "select squantity from inventory where sid = ?";
        String checkQuery = "SELECT COUNT(*) AS count FROM inventory WHERE sid = ?";
        int quantity = 0;
        int rowCount = 0;
        try{
            PreparedStatement checkStatement = getConnection().prepareStatement(checkQuery);
            checkStatement.setInt(1,sid);
            ResultSet checkResult = checkStatement.executeQuery();
            while(checkResult.next())rowCount = checkResult.getInt("count");
            if (rowCount>0){
                statement = getConnection().prepareStatement(query);
                statement.setInt(1,sid);
                ResultSet result = statement.executeQuery();
                while(result.next()) quantity = result.getInt("squantity");
                System.out.println("recieved quantity from the table: " + quantity);
                if(quantity<count){
                    return -1;
                }
                else if(quantity>=count){
                    return 1;
                }
                else{
                    System.out.println("something went wrong!");
                    return 0;
                }
            }
            else{
                System.out.println("sid doesn't exist!");
                return -2;
            }
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            return -1;
        }
    }
    //gets category name from the category table
    public static List<String> getCategoryNames(){
        String query = "SELECT CNAME FROM CATEGORY";
        List<String> categories = new ArrayList<>();
        try{
            statement = getConnection().prepareStatement(query);
            ResultSet results = statement.executeQuery();
            while(results.next()){
                categories.add(results.getString("cname"));
            }
            if(connection != null)connection.close();
            return categories;
        }
        catch(SQLException exc){
            return null;
        }
    }
    //gets the last sid 
    public static int getLastSid(){
        String query = "SELECT sid FROM cloth_shop_test.stock order by sid desc limit 1;";
        int id = -1;
        try{
            statement = getConnection().prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                id = result.getInt("sid");
            }
            if (connection!=null)connection.close();
            return id;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            exc.printStackTrace();
            return id;
        }
    }
    //gets cid for the category name
    public static int getCid(String cname){
        System.out.println("getcid");
        String query = "SELECT cid FROM cloth_shop_test.category where cname = ?";
        int cid = -1;
        try{
            statement = getConnection().prepareStatement(query);
            statement.setString(1,cname);
            ResultSet result = statement.executeQuery();
            
            while(result.next()){
                cid = result.getInt("cid");
            }
            System.out.println("returned >> "+cid);
            return cid;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            exc.printStackTrace();
            return cid;
        }
    }    
    //gets the color in the table
    public static List<String> getColors(){
        String query = "SELECT color FROM colors";
        List<String> colors = new ArrayList<>();
        try{
            statement = getConnection().prepareStatement(query);
            ResultSet results = statement.executeQuery();
            while(results.next()){
                colors.add(results.getString("color"));
            }
            if(connection != null)connection.close();
            return colors;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            return null;
        }
    }
    //adds color
    public static void addColor(String color){
        try{
            int rowCount = 0;
            String checkQuery = "SELECT COUNT(*) AS count FROM colors WHERE color = ?"; 
            PreparedStatement checkstmnt = getConnection().prepareStatement(checkQuery);
            checkstmnt.setString(1,color);
            ResultSet checkResult = checkstmnt.executeQuery();
            while(checkResult.next()) rowCount = checkResult.getInt("count");  
            if(rowCount==0){
                String query = "insert into colors(color) values (?)";
                updateTable(query, new Object[]{color});
            }
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
    }
    //gets color_id
    public static int getColorId(String color){
        int color_id = -1;
        try{
            String query = "select color_id as id from colors where color = ?";
            statement = getConnection().prepareStatement(query);
            statement.setString(1,color);
            ResultSet results = statement.executeQuery();
            while(results.next()) color_id = results.getInt("id");
            return color_id;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
        return color_id;
    }
    
// system procedurs >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
    //  --adding new category--
    public static void addNewCategory(String categoryName){
        String query = "insert into category(cname) values (?)";
        updateTable(query, new Object[]{categoryName});
    }

    //  --adding new stock--
    public static void addNewStock(int cid, String size,String color, int squantity, double buying_price, double selling_price, String buying_date){
        System.out.println("inserting data >> "+cid+" "+getColorId(color)+" "+size+" "+squantity+" "+buying_price+" "+selling_price+" "+buying_date);
        String query = "insert into stock(cid,color_id,size,squantity,buying_price,selling_price,buying_date) values (?,?,?,?,?,?,?)";
        int sid = updateTable(query, new Object[] {cid,getColorId(color),size,squantity,buying_price,selling_price,buying_date});
        addStocksToInventory(sid, squantity);//updates inventory aswell! 
    }
    //  adding new stock to the inventory 
    private static void addStocksToInventory(int sid, int squantity){
        String query = "insert into inventory(sid,squantity) values (?,?) ON DUPLICATE KEY UPDATE squantity = squantity + VALUES(squantity);";
        updateTable(query, new Object[] {sid,squantity});
    }

    //  --do the sell--
    public static void doTransaction(String date,String customer_name,String customer_address,String customer_tel_number,int sid,int count){
        String query = "insert into transactions(date,customer_name,customer_address,customer_tel_number,sid,count,amount) values (?,?,?,?,?,?,?)";
        double buying_price = (double) getSellingPrice(sid);
        double amount = count*buying_price;
        updateTable(query, new Object[] {date,customer_name,customer_address,customer_tel_number,sid,count,amount});
        removeItemsFromInventory(sid,count);
    }
    //  gets the selling price for the sid;
    private static Object getSellingPrice(int sid){
        String query = "select selling_price from stock where sid = ?";
        double selling_price = 0;
        try{
            statement = getConnection().prepareStatement(query);
            statement.setInt(1,sid);
            ResultSet dataSet = statement.executeQuery();
            while (dataSet.next()) {selling_price = dataSet.getDouble("selling_price");}
            connection.close();
            return selling_price;
        }
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            System.out.println("\n---- stack trace ----");
            exc.printStackTrace();
            return null;
        }   
    }
    // removing items from the inventory
    public static void removeItemsFromInventory(int sid,int count){
        String query = "UPDATE inventory SET squantity = squantity - ? WHERE sid = ?";
        try {
            statement = getConnection().prepareStatement(query);
            statement.setInt(1, count);
            statement.setInt(2, sid);
            statement.executeUpdate();
            if (connection!=null||!connection.isClosed()) connection.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
   
}
