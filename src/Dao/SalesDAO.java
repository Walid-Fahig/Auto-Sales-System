
package Dao;

import Table.Sales;
import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class SalesDAO {
     private  Connection myConn;
     
     public SalesDAO () throws Exception{
        String db_name="jdbc:mysql://localhost:3306/vehicle";
        String encoding="?useUnicode=yes&characterEncoding=UTF-8";
        String db_name_with_encoding=db_name+encoding;
        String user ="root";
        String password="";
        
        myConn = (Connection) DriverManager.getConnection(db_name_with_encoding, user, password);
        System.out.println("SalesDAO   - DB  connection successful to:"+ db_name_with_encoding); 
    }//End method SalesDAO
   
     public void deleteSales(String Id) throws Exception {
        PreparedStatement myStmt =null;
        
        try{
            //prepare statement
            myStmt =myConn.prepareStatement("DELETE FROM sales WHERE id=?");
            //set param
            myStmt.setString(1,Id);
            //execute SQL
            myStmt.executeUpdate();  
             
        }
         finally{
            DAOclose.close(myStmt);
        }
    }//End method deleteSales
     
     public void addSales(Sales theSales) throws Exception {
       PreparedStatement myStmt=null;
       
       try{
           //
           myStmt =myConn.prepareStatement("INSERT INTO sales ( price ,payment_type , user_id) VALUES (?,?,?)");
           //
          
           myStmt.setString(2,theSales.getPrice());
           myStmt.setString(4,theSales.getPayment_type());
           myStmt.setString(5,theSales.getUser_id());
           //
           myStmt.executeUpdate();
       }
        finally{
           DAOclose.close(myStmt);
       }
       
    }//End method addSales
     
    public List<Sales> getAllSales() throws Exception {
       List<Sales> list =new ArrayList<Sales>();
       
        Statement myStmt =null;
        ResultSet myRs =null;
        
        try{
            //
            myStmt =(Statement) myConn.createStatement();
            myRs =myStmt.executeQuery("SELECT * FROM sales");
            //
            while(myRs.next()){
                Sales sales= convertRowToSales(myRs);
                list.add(sales);
            }
            return list;
        }
         finally{
            DAOclose.close(myStmt, myRs);
        }
        
    }//End method getAllSales 
    
     private Sales convertRowToSales(ResultSet myRs) throws Exception {
        String id =myRs.getString("car_id");
        //String model_id =myRs.getString("model_id");
        String price =myRs.getString("price");
       // String year =myRs.getString("year");
        Date date =myRs.getDate("Date");
        String payment_type=myRs.getString("payment_type");
        String user_id=myRs.getString("user_id");
        
        Sales sales=new Sales(id,price,date,payment_type,user_id);
        
        return sales;
    }//End method convertRowToSales
     
}//End class
