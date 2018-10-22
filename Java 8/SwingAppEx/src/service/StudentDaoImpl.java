
package service;

import connection.DbConnection;
import dao.studentDao;
import domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDaoImpl implements studentDao{

    Connection conn = DbConnection.getConnection("xe","hr","hr");
    
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
            PreparedStatement ps = conn.prepareStatement("insert into info(id,name)values(?,?)");
            
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            
            ps.executeUpdate();
            System.out.println("1 Data has been Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Student s) {
        try {
            PreparedStatement ps = conn.prepareStatement("update info set name=? where id=?");
            
            ps.setString(1, s.getName());
            ps.setInt(2, s.getId());
                        
            ps.executeUpdate();
            System.out.println("1 Data has been Updated");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Student s) {
        try {
            PreparedStatement ps = conn.prepareStatement("delete from info where id=?");
            
            ps.setInt(1, s.getId());
           
            
            ps.executeUpdate();
            System.out.println("1 Data has been Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Student getById(int id) {
        Student d = new Student();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from info where id=?");
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                d.setId(rs.getInt(1));
                d.setName(rs.getString(2));
               
            }
            
            ps.executeUpdate();
            System.out.println("1 Data has been Showed");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    @Override
    public List<Student> getStudent() {
        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from info");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student st = new Student();
                st.setId(rs.getInt(1));
                st.setName(rs.getString(2));
               list.add(st);
            }
            
            ps.executeUpdate();
            System.out.println("1 Data has been Selected");
        } catch (SQLException ex) {
            Logger.getLogger(StudentDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
    
}
