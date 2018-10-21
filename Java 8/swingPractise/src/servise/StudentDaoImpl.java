
package servise;

import connection.DnConnection;
import dao.StudentDao;
import domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDaoImpl implements StudentDao{
    
    Connection conn = DnConnection.getConnection("xe", "hr", "hr");
    
    @Override
    public void createTable(String sql) {
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeQuery();
            System.out.println("1 Table has been Created");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Student s) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into students(id,name)values(?,?)");
            
            ps.setInt(1, s.getStudentId());
            ps.setString(2, s.getStudentName());
        
            ps.executeUpdate();
            System.out.println("1 Data has been Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            PreparedStatement ps = conn.prepareStatement("update students set name=? where id=?");
            
            ps.setString(1, s.getStudentName());
            ps.setInt(2, s.getStudentId());
            
        
            ps.executeUpdate();
            System.out.println("1 Data has been Updated");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Student s) {
       try {
            PreparedStatement ps = conn.prepareStatement("delete from students where id=?");
            
           
            ps.setInt(1, s.getStudentId());
            
        
            ps.executeUpdate();
            System.out.println("1 Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Student getByid(int id) {
        Student s = new Student();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from students where id=?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s.setStudentId(rs.getInt(1));
                s.setStudentname(rs.getString(2));
                
            }
            ps.executeUpdate();
            System.out.println("1 Data has Benn Showed");
                    } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    @Override
    public List<Student> getStudent() {
        List<Student> list = new  ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from students");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               Student s = new Student();
               s.setStudentId(rs.getInt(1)); 
               s.setStudentname(rs.getString(2)); 
               list.add(s);
            }
        
             ps.executeUpdate();
            System.out.println("1 Data has been Selected");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
