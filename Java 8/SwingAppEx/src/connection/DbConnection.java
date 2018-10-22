
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final  String HOST = "jdbc:oracle:thin:@localhost";
    private static final  String PORT = "1521";
    private  static Connection connection;
    private  static String url = HOST+":"+PORT+":";
    
    public static Connection getConnection(String dbname,String dbusername,String dbpass){ 
        try {
            connection = DriverManager.getConnection(url+dbname,dbusername,dbpass);
            System.out.println("::Connected::");
        } catch (Exception e) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null,e);
        }
        return connection;
    }
}
