
package Dao;

import SwingGUI.MainInterfacee;
import Table.Model;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;



public class ModelDAO {
    
    private  Connection myConn;
    
    
    public ModelDAO()  throws  Exception {
        
        String db_name="jdbc:mysql://localhost:3306/vehicle";
        String encoding="?useUnicode=yes&characterEncoding=UTF-8";
        String db_name_with_encoding=db_name+encoding;
        String user ="root";
        String password="";
        
        myConn = (Connection) DriverManager.getConnection(db_name_with_encoding, user, password);
        System.out.println("ModelDAO  - DB  connection successful to:"+ db_name_with_encoding);       
    }//End method ModelDAo
    
    public void deleteModel(int modelId) throws Exception {
        PreparedStatement myStmt =null;
        
        try{
            //prepare statement
            myStmt =myConn.prepareStatement("DELETE FROM model WHERE id=?");
            //set param
            myStmt.setInt(1, modelId);
            //execute SQL
            myStmt.executeUpdate();  
      
        }
         finally{
            DAOclose.close(myStmt);
        }
    }//End method deleteModel
    
    public void updateModel(Model theModel) throws Exception {
       PreparedStatement myStmt=null ;
       
       try{
           //
           myStmt =myConn.prepareStatement("UPDATE model SET make = ?, name = ?, class = ? WHERE id = ?");
           //
           myStmt.setString(1,theModel.getmake());
           myStmt.setString(2,theModel.getName());
           myStmt.setString(3,theModel.getclass());
           myStmt.setInt(4,theModel.getId());
           //
           myStmt.executeUpdate();
           
       } 
        finally {
           DAOclose.close(myStmt);
       }
         
    }//End method updateModel
    
    public void addModel(Model theModel) throws Exception {
       PreparedStatement myStmt=null;
       
       try{
           //
           myStmt =myConn.prepareStatement("INSERT INTO model (make,name, class) VALUES (?, ?, ?)");
           //
           myStmt.setString(1,theModel.getmake());
           myStmt.setString(2,theModel.getName());
           myStmt.setString(3,theModel.getclass());
           //
           myStmt.executeUpdate();
          
       }
        finally{
           DAOclose.close(myStmt);
       }
       
    }//End method addModel
    
    
    
    public List<Model> getAllModel() throws Exception {
       List<Model> list =new ArrayList<Model>();
       
        Statement myStmt =null;
        ResultSet myRs =null;
        
        try{
            //
            myStmt =(Statement) myConn.createStatement();
            myRs =myStmt.executeQuery("SELECT * FROM model");
            //
            while(myRs.next()){
                Model model= convertRowToModel(myRs);
                list.add(model);
            }
            return list;
        }
         finally{
            DAOclose.close(myStmt, myRs);
        }
        
    }//End method getAllModel
    
    public List<Model> searchModel(String Name) throws Exception {
       List<Model> list =new ArrayList<Model>();
       
        PreparedStatement myStmt =null;
        ResultSet myRs =null;
        
        try{
            //
            Name +="%";
            myStmt =myConn.prepareStatement("SELECT * FROM model WHERE name like ? order by name ");
            
            myStmt.setString(1,Name);
            
            myRs =myStmt.executeQuery();
            
            while(myRs.next()){
                Model model =convertRowToModel(myRs);
                list.add(model);
            }
            return list;
        }
         finally{
            DAOclose.close(myStmt, myRs);
        }
        
    }//End method searchModel
    
    private Model convertRowToModel(ResultSet myRs) throws Exception {
        
        int id =myRs.getInt("id");
        String make =myRs.getString("make");
        String Name =myRs.getString("name");
        String _class=myRs.getString("class");
        
        Model model=new Model(id,make,Name,_class);
        
        return model;
    }//End method convertRowToModel    
      
}//End class
