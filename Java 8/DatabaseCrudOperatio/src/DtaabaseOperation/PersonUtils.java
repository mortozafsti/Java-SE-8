
package DtaabaseOperation;

import databasecrudoperatio.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonUtils {
    
    private static final Connection conn = MySqlConnection.getConnection();
    
    public static void insert(Person p) {
        String sql = "insert into psInfo(id,name,email)values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setString(3, p.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(PersonUtils.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void update(Person p) {
        String sql = "update psInfo set name =?, email=? where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, p.getName());
            ps.setString(2, p.getEmail());
            ps.setInt(3, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(PersonUtils.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static ResultSet showgetBtId(int id) {
        String sql = "select * from psInfo where id =?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id); 
            rs =ps.executeQuery();
        } catch (Exception e) {
            Logger.getLogger(PersonUtils.class.getName()).log(Level.SEVERE, null,e);
        }
        return rs;
    }
    public static List<Person> getAllPerson() {
        List<Person> person = new ArrayList<>();
        String sql = "select * from psInfo";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                person.add(new Person(rs.getInt(1),rs.getString(2),rs.getString(3)));
            }
            
        } catch (Exception e) {
            Logger.getLogger(PersonUtils.class.getName()).log(Level.SEVERE, null,e);
        }
        return person;
    }
}
