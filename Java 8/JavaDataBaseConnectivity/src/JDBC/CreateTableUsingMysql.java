
package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTableUsingMysql {
    
   private static final Connection conn = MySqlConnection.getConnection();
   
    public static void createTable(){ 
        
        String sql = "create table division(id int(15), name varchar(30))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            
        }
    }
}
