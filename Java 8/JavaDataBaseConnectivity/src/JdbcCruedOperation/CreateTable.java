
package JdbcCruedOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTable {
    
   private static final Connection conn =  MyConnection.getConnection();
   
    public static void createTables() {
        
        String sql = "create table students(id int(10) primary key,name varchar(20),email varchar(20))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            
        }
    }
    public static void main(String[] args) {
        
        createTables();
    }
}
