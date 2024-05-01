/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package previousVersisons;

import Backend.SQLManager;
import Backend.SQLStatisticsManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author User
 */
public class Test1 {
    public static void main(String[] args) {
//        try{
////            List <Object[]> rows = SQLStatisticsManager.getHistory(1,"","");
//            List <Object[]> rows = SQLStatisticsManager.getHistory(2,"2024-04-09","2024-04-09");
//            for(Object[] row:rows){
//                for(Object data:row){
//                    System.out.println(data);
//                }
//                System.out.println("");
//            }
//        }
//        catch(SQLException ex){
//            System.out.println(ex.getMessage());
//        }
        System.out.println(getMonth());

    }
    public static String getMonth(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedDate = date.format(formatter);
        return formattedDate;
    }
}
