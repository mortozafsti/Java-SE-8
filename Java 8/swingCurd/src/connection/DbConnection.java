
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DRIVERNAME = "oracle.jdbc.driver.OracleDriver";
    private static final String HOST = "jdbc:oracle:thin:@localhost";
    private static final String PORT = "1521";
    private static Connection connection;
    private static String url = HOST + ":" + PORT + ":";
    
    public static Connection getConnection(String dbname,String dbUsername, String dbPass){ 
        
        try {
            connection = DriverManager.getConnection(url + dbname, dbUsername,dbPass);
            System.out.println("::Connected::");
        } catch (SQLException e) {
            e.printStackTrace();
           // Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null,e);
        }
       return connection;
    }
}
