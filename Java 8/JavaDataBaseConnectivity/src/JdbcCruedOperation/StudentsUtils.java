package JdbcCruedOperation;

import EvidenceSwingSix.StudentUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentsUtils {

    private static Connection conn = MyConnection.getConnection();

    public static void insertData(Student s) {
        String sql = "insert into students(id, name, email) values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getEmail());

            ps.executeUpdate();

            System.out.println("Data Inserted");
        } catch (Exception e) {
        }
    }

    public static void updateData(Student s) {
        String sql = "update students set name=?,email=? where id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getId());
            ps.executeUpdate();

            System.out.println("Data Updated");
        } catch (Exception e) {
        }
    }

    public static ResultSet getdataById(int id) {
        ResultSet rs = null;
        String sql = "select * from students where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
//            ps.setString(1, s.getName());
//            ps.setString(2, s.getEmail());

            rs = ps.executeQuery();

            System.out.println("Data Show");
        } catch (Exception e) {
        }
        return rs;
    }

    public static void deleteData(int id) {
        ResultSet rs = null;
        String sql = "delete from students where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);
//            ps.setString(1, s.getName());
//            ps.setString(2, s.getEmail());

            rs = ps.executeQuery();

            System.out.println("Data Deleted");
        } catch (Exception e) {
        }

    }

    public static List<Student> getAllData() {
        List<Student> list = new ArrayList<>();
        Student student;
        String sql = "select * from students";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));

            }
            System.out.println("All Data Showed In Table");
        } catch (Exception e) {
        }
        return list;
    }

    
}
