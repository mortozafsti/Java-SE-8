
package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertIntoTable {
    
    private static Connection conn = MySqlConnection.getConnection();
    
    public static void insertData(){ 
        String sql="insert into division(id,name)values(1,'Dhaka')";
        try { 
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertData2(int id,String name){ 
        String sql="insert into division(id,name)values(?,?)";
        try { 
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Data Inserted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateData(int id,String name){ 
        String sql="update division set name= ? where id = ? ";
        try { 
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setInt(2, id);
            
            ps.executeUpdate();
            System.out.println("Data Updated Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteData(int id){ 
        String sql="delete from division where id = ? ";
        try { 
            PreparedStatement ps = conn.prepareStatement(sql);
            
           // ps.setString(1, name);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            System.out.println("Data Deleted Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(InsertIntoTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet getDataById(int id){ 
        ResultSet rs=null;
        String sql="Select * from division where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id); 
             rs = ps.executeQuery();
            
//            while (rs.next()) {
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
//                
//            }     
        } catch (Exception e) {
            
        }
        return rs;
    }
}
