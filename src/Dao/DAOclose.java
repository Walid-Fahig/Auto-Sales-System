
package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DAOclose {
    
    public  static  void close(Connection myConn , Statement myStmt , ResultSet myRs) throws  SQLException {
        
        if(myConn !=null)
           myConn.close();
        
        if(myStmt !=null)
           myStmt.close();
        
        if(myRs !=null)
           myRs.close();
    }
    
    public static void close(Statement myStmt , ResultSet myRs) throws SQLException {
           close(null ,myStmt ,myRs);
    }
    
    public static void close(Statement myStmt) throws SQLException {
           close(null ,myStmt ,null);
    }
    
}//End class
