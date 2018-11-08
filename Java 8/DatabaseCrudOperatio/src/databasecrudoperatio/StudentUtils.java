
package databasecrudoperatio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentUtils {
    public static final Connection conn = MySqlConnection.getConnection();
    
    public static void inser(Student s) {
        
        String sql = "insert into student(id,name,email) values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail()); 
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(StudentUtils.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void update(Student s) {
        
        String sql = "update student set name=? ,email=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail()); 
            ps.setInt(3, s.getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(StudentUtils.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static ResultSet showgetById(int id) {
        ResultSet rs = null;
        String sql = "Select * from student where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, s.getName());
//            ps.setString(2, s.getEmail()); 
            ps.setInt(1, id);
            
           rs = ps.executeQuery();
        } catch (Exception e) {
            Logger.getLogger(StudentUtils.class.getName()).log(Level.SEVERE, null,e);
        }
        return rs;
    }
    public static List<Student> getAllStudent() {
        List<Student> s = new ArrayList<>();
        String sql = "Select * from student";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while (rs.next()) {
                System.out.println(s.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3))));  
                
            }
            System.out.println("All Data Showed In Table");
        } catch (Exception e) {
            Logger.getLogger(StudentUtils.class.getName()).log(Level.SEVERE, null,e);
        }
        return s;
    }
    
}
