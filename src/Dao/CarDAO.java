
package Dao;

import Table.Car;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javafx.event.EventType;
import javax.swing.JOptionPane;




public class CarDAO {
    
    private  Connection myConn;
    
    public CarDAO() throws Exception{
        String db_name="jdbc:mysql://localhost:3306/vehicle";
        String encoding="?useUnicode=yes&characterEncoding=UTF-8";
        String db_name_with_encoding=db_name+encoding;
        String user ="root";
        String password="";
        
        myConn = (Connection) DriverManager.getConnection(db_name_with_encoding, user, password);
        System.out.println("CarDAO  - DB  connection successful to:"+ db_name_with_encoding); 
    }//End method CarDAO
    
    public void deleteCar(int carId) throws Exception {
        PreparedStatement myStmt =null;
        
        try{
            //prepare statement
            myStmt =myConn.prepareStatement("DELETE FROM car WHERE id=?");
            //set param
            myStmt.setInt(1, carId);
            //execute SQL
            myStmt.executeUpdate();  
             
        }
         finally{
            DAOclose.close(myStmt);
        }
    }//End method deleteCar
    
    public void updateCar(Car theCar) throws Exception {
       PreparedStatement myStmt=null ;
       
       try{
           //
           myStmt =myConn.prepareStatement("UPDATE car SET model_id= ?, color = ?, year=?, price=? WHERE id = ?");
           //
           myStmt.setString(1,theCar.getModel_id());
           myStmt.setString(2,theCar.getColor());
           myStmt.setString(3,theCar.getYear());
           myStmt.setString(4,theCar.getPrice());
           myStmt.setInt(5,theCar.getId());
           //
           myStmt.executeUpdate();
          
       } 
        finally {
           DAOclose.close(myStmt);
       }
         
    }//End method updateCar
    
    public void addCar(Car theCar) throws Exception {
       PreparedStatement myStmt=null;
       
       try{
           //
           myStmt =myConn.prepareStatement("INSERT INTO car (model_id , color , year , price) VALUES (?,? ,?,?)");
           //
           myStmt.setString(1,theCar.getModel_id());
           myStmt.setString(2,theCar.getColor());
           myStmt.setString(3,theCar.getYear());
           myStmt.setString(4,theCar.getPrice());
           //
           myStmt.executeUpdate();
           
       }
        finally{
           DAOclose.close(myStmt);
       }
       
    }//End method addCar
 
    public List<Car> getAllCar() throws Exception {
       List<Car> list =new ArrayList<Car>();
       
        Statement myStmt =null;
        ResultSet myRs =null;
        
        try{
            //
            myStmt =(Statement) myConn.createStatement();
            myRs =myStmt.executeQuery("SELECT * FROM car");
            //
            while(myRs.next()){
                Car car= convertRowToCar(myRs);
                list.add(car);
            }
            return list;
        }
         finally{
            DAOclose.close(myStmt, myRs);
        }
        
    }//End method getAllCar
    
    public List<Car> searchCar(String model_id) throws Exception {
       List<Car> list =new ArrayList<Car>();
       
        PreparedStatement myStmt =null;
        ResultSet myRs =null;
        
        try{
            //
            model_id +="%";
            myStmt =myConn.prepareStatement("SELECT * FROM car WHERE model_id like ? order by model_id ");
            
            myStmt.setString(1,model_id);
            
            myRs =myStmt.executeQuery();
            
            while(myRs.next()){
                Car car =convertRowToCar(myRs);
                list.add(car);
            }
            return list;
        }
         finally{
            DAOclose.close(myStmt, myRs);
        }
        
    }//End method searchCar
    
   
    
    private Car convertRowToCar(ResultSet myRs) throws Exception {
        
        int id =myRs.getInt("id");
        Date date =myRs.getDate("date");
        String model_id =myRs.getString("model_id");
        String color=myRs.getString("color");
        String year=myRs.getString("year");
        String price=myRs.getString("price");
        
        Car car=new Car(id,date,model_id,color,year,price);
        
        return car;
    }//End method convertRowToCar
    
}//End class
