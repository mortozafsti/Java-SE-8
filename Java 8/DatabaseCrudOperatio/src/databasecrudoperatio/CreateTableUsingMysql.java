
package databasecrudoperatio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMysql {
    private static final Connection conn = MySqlConnection.getConnection();
    
    public static void createTables(){ 
        String sql = "create table student(id int(10) primary key,name varchar(20),email varchar(20))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) {
//        createTables();
//    }
}
