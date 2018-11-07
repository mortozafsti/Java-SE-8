
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {
    
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "milton";
    private static final String Url = HOST+"/"+DBNAME;
    private static Connection conn = null;
    
    public static Connection getConnection(){ 
        try {
            conn = DriverManager.getConnection(Url, "root", "1234");
            System.out.println(":Connected:");
        } catch (Exception e) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null,e);
        }
        return conn;
    }
    
}
