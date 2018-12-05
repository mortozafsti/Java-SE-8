
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySqlConnection {

    private static final String HOST= "jdbc:mysql://localhost:3306";
    private static final String DBNAME= "modulesix";
    private static final String Url= HOST+"/"+DBNAME;
    private static Connection conn = null;
    
    public static Connection getConnection(){
        
        try {
            conn = DriverManager.getConnection(Url, "root", "1234");
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
