package JujubesInventoryManager.Backend;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SQLStatisticsManager extends SQLManager {
 
    //with date range
    private static ResultSet getResult(String query, String sDate, String eDate){
        try{
            statement = getConnection().prepareStatement(query);
            statement.setString(1,sDate);
            statement.setString(2,eDate);
            ResultSet results = statement.executeQuery();
            return results;
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
            return null;
        }
    }
    
    //gets total statistics
    public static List<Object[]> getTotalSummery(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query = "select sum(t.amount) as Amount , sum(t.count) as Count , sum(t.amount - (s.buying_price * t.count)) as Profit, sum(s.buying_price * t.count) as Cost\n" +
            "from transactions t\n" +
            "inner join stock s on t.sid = s.sid \n" +
            "where t.date between ? and ? ";
        results = getResult(query,sDate,eDate);
        while(results.next()) rows.add(new Object[]{results.getDouble("Amount"), results.getInt("Count"), results.getDouble("Profit"), results.getDouble("Cost")});
        return rows;        
    }
    
    //Amount (gets the amounts of the sold items),
    //Overall: Category id | Category name | total amount
    public static List<Object[]> getOverallAmount(String sDate, String eDate) throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', SUM(t.amount) AS 'Total amount'\n" +
            "FROM category c\n" +
            "INNER JOIN stock s ON c.cid = s.cid\n" +
            "INNER JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ?\n" +
            "GROUP BY c.cid, c.cname;";
        results = getResult(query,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getDouble("Total amount")});
        return rows;
    }
    //Size: Category id | category name | size | amount 
    public static List<Object[]> getSizeAmount(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', s.size AS 'Size', SUM(t.amount) AS 'Amount'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ?\n" +
            "GROUP BY c.cid, c.cname, s.size;";
        results = getResult(query,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getDouble("Amount")});
        return rows;        
    }
    //Stock and color: Stock id | category id | category name | size | color | amount
    public static List<Object[]> getStockColorAmount(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query = "SELECT s.sid AS 'Stock id', c.cid AS 'Category id', c.cname AS 'Category name', s.size AS 'Size', clr.color AS 'Color', t.amount AS 'Amount'\n" +
            "FROM stock s\n" +
            "LEFT JOIN colors clr ON s.color_id = clr.color_id\n" +
            "LEFT JOIN category c ON s.cid = c.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ? ;";
        results = getResult(query,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Stock id"),results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getString("Color"),results.getDouble("Amount")});
        return rows; 
    }
    
    //Count (get count of the sold items),
    //Overall: Category id | Category name | Total quantity  
    public static List<Object[]> getOverallCount(String sDate, String eDate) throws SQLException{
        ResultSet results = null;
        List <Object[]> rows = new ArrayList<>();
        String query2 = "SELECT c.cid AS 'Category id',c.cname AS 'Category name',SUM(t.count) AS 'Total quantity'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "where t.date between ? and ?\n" +
            "GROUP BY c.cid, c.cname;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getInt("Total quantity")});
        return rows;
    }
    //Size: Category id | Category name | size | Quantity  
    public static List<Object[]> getSizeCount(String sDate, String eDate)throws SQLException{
        ResultSet results = null;
        List <Object[]> rows = new ArrayList<>();
        String query2 = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', s.size AS 'Size', SUM(t.count) AS 'Quantity'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "where t.date between ? and ?\n" +
            "GROUP BY c.cid, c.cname, s.size;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getInt("Quantity")});
        return rows;
    }
    //Stock and color: Stock id | category id | category name | size | color | count
    public static List<Object[]> getStockColorCount(String sDate, String eDate)throws SQLException{
        ResultSet results = null;
        List <Object[]> rows = new ArrayList<>();
        String query2 = "select s.sid AS 'stock id',c.cid as 'category id',c.cname as 'category name',s.size AS 'size',clr.color as 'color',sum(t.count) as 'total quantity'\n" +
            "from category c\n" +
            "left join stock s on c.cid = s.cid\n" +
            "join colors clr on s.color_id = clr.color_id\n" +
            "left join transactions t on s.sid = t.sid\n" +
            "where t.date between ? and ?\n" +
            "group by s.sid,c.cid,c.cname,clr.color;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("stock id"),results.getInt("category id"),results.getString("category name"),results.getString("size"),results.getString("color"),results.getInt("total quantity")});
        return rows;
    }
    
    //Overall: Category id | Category name | profit  
    public static List<Object[]> getOverallProfit(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query2 = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', SUM(t.amount - s.buying_price * t.count) AS 'Total profit'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ? \n" +
            "GROUP BY c.cid, c.cname;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getDouble("Total profit")});
        return rows;
    }
    //Size: Category id | category name | size | count | profit 
    public static List<Object[]> getSizeProfit(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query2 = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', s.size AS 'Size', SUM(t.count) AS 'Quantity', SUM((t.amount - s.buying_price * t.count)) AS 'Profit'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ? \n" +
            "GROUP BY c.cid, c.cname, s.size;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getInt("Quantity"),results.getDouble("Profit")});
        return rows;
    }
    //Color: category id | category name | size | color | count | profit
    public static List<Object[]> getColorProfit(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query2 = "SELECT c.cid AS 'Category id', c.cname AS 'Category name', s.size AS 'Size',clr.color as 'color', SUM(t.count) AS 'Quantity', SUM((t.amount - s.buying_price * t.count)) AS 'Profit'\n" +
            "FROM category c\n" +
            "LEFT JOIN stock s ON c.cid = s.cid\n" +
            "LEFT JOIN colors clr ON s.color_id = clr.color_id\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ? \n" +
            "GROUP BY c.cid, c.cname, s.size, clr.color;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getString("color"),results.getInt("Quantity"),results.getDouble("Profit")});
        return rows;
    }
    //Stock and color: Stock id | Category id | category name | size | color | count | profit
    public static List<Object[]> getStockProfit(String sDate, String eDate)throws SQLException{
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        String query2 = "SELECT\n" +
            "    s.sid AS 'Stock id',\n" +
            "    c.cid AS 'Category id',\n" +
            "    c.cname AS 'Category name',\n" +
            "    s.size AS 'Size',\n" +
            "    clr.color as 'color',\n" + 
            "    sum(t.count) AS 'Quantity',\n" +
            "    s.buying_price AS 'buying price',\n" +
            "    s.selling_price AS 'selling price',\n" +
            "    SUM((t.amount - s.buying_price * t.count)) AS 'Profit'\n" +
            "FROM stock s\n" +
            "LEFT JOIN colors clr ON s.color_id = clr.color_id\n" +
            "LEFT JOIN category c ON s.cid = c.cid\n" +
            "LEFT JOIN transactions t ON s.sid = t.sid\n" +
            "WHERE t.date BETWEEN ? AND ?\n" +
            "GROUP BY s.sid, c.cname, s.size, clr.color;";
        results = getResult(query2,sDate,eDate);
        while(results.next())rows.add(new Object[]{results.getInt("Stock id"),results.getInt("Category id"),results.getString("Category name"),results.getString("Size"),results.getString("color"),results.getInt("Quantity"),results.getDouble("buying price"),results.getDouble("selling price"),results.getDouble("Profit")});
        return rows;
    }
    
    //transactions: for the time range and the default time range 
    public static List<Object[]> getHistory (int flag ,String sDate ,String eDate)throws SQLException{ 
        List <Object[]> rows = new ArrayList<>();
        ResultSet results = null;
        
        String query1 = "select t.date as date, t.customer_name as customer_name, t.customer_tel_number as customer_number, t.customer_address as address, s.sid as sid, c.cid as cid, c.cname as category, clr.color as color, s.size as size, t.count as count \n" +
                "from transactions t \n" +
                "left join stock s on t.sid = s.sid \n" +
                "left join colors clr on s.color_id = clr.color_id \n" +
                "left join category c on s.cid = c.cid ;";
        String query2 = "select t.date as date, t.customer_name as customer_name, t.customer_tel_number as customer_number, t.customer_address as address, s.sid as sid, c.cid as cid, c.cname as category, clr.color as color, s.size as size, t.count as count \n" +
                "from transactions t \n" +
                "left join stock s on t.sid = s.sid \n" +
                "left join colors clr on s.color_id = clr.color_id \n" +
                "left join category c on s.cid = c.cid \n" +
                "where t.date between ? and ? ;";
                
        switch(flag){
            case 1:
                try{
                    statement = getConnection().prepareStatement(query1);
                    results = statement.executeQuery();
                }
                catch(SQLException exc){
                    System.out.println(exc.getMessage());
                    return null;
                }
                break;
            case 2:
                results = getResult(query2,sDate,eDate);
                break;
            default:
                break;
        }
        while(results.next())rows.add(new Object[]{results.getString("date"), results.getString("customer_name"), results.getString("customer_number"), results.getString("address"), results.getInt("sid"), results.getInt("cid"), results.getString("category"), results.getString("color"), results.getString("size"), results.getInt("count")});
        return rows;
    }
    
}
