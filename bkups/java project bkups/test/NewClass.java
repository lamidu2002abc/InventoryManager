import Backend.SQLStatisticsManager;
import java.sql.SQLException;
public class NewClass {
    public static void main(String[] args) {
        try{
            System.out.println(SQLStatisticsManager.getTotalSummery("2024-05-01","2024-05-01"));
        }
        catch(SQLException exc){
            System.out.println("err");
        }
    }
}
