
package DtaabaseOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateTables{
    private static final Connection conn = MyConnection.getConnection();
    
    public static void createTabless(){ 
        String sql = "create table psInfo(id int(10) primary key,name varchar(15),email varchar(20))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        createTabless();
    }
    public static void createTablesss(){ 
        String sql = "create table psInfo(id int(10) primary key,name varchar(15),email varchar(20))";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
        }
    }
    
}
