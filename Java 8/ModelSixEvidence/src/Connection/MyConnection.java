
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyConnection {
    
    private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNAME = "evidence";
    private static final String URL = HOST+"/"+DBNAME;
    private static Connection conn = null;

    public static Connection getConnection() {
       
        try {
            conn = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("Connected");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
//    public static void main(String[] args) {
//        getConnection();
//    }
    
}
