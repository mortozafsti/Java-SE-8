
package Service;

import Connection.MyConnection;
import Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportService {
    
    public static Connection conn = MyConnection.getConnection();
    
    /////////////////////////////User report//////////////////////////////////
    public static List<User> getUserListByStatus(boolean status) {
        List<User> userlist = new ArrayList<>();
        String sql = "select * from user where status = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, status); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2)); 
                user.setPassword(rs.getString(3)); 
                user.setUserType(rs.getString(4)); 
                user.setFirstName(rs.getString(5)); 
                user.setLastName(rs.getString(6)); 
                user.setEmail(rs.getString(7)); 
                user.setMobile(rs.getString(8)); 
                user.setRegiDate(rs.getDate(9)); 
                user.setStatus(rs.getBoolean(10)); 
                userlist.add(user); 
                  
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userlist;
    }
    public static List<User> getUserListByUserType(String userType) {
        List<User> userlistsFromUser = new ArrayList<>();
        String sql = "select * from user where userType = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userType); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2)); 
                user.setPassword(rs.getString(3)); 
                user.setUserType(rs.getString(4)); 
                user.setFirstName(rs.getString(5)); 
                user.setLastName(rs.getString(6)); 
                user.setEmail(rs.getString(7)); 
                user.setMobile(rs.getString(8)); 
                user.setRegiDate(rs.getDate(9)); 
                user.setStatus(rs.getBoolean(10)); 
                userlistsFromUser.add(user); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userlistsFromUser; 
    } 
    public static List<User> getuserListByTypeandStatus(String userType,boolean status) {
        List<User> list = new ArrayList<>();
        String sql = "select * from user where userType = ? and status = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userType); 
            ps.setBoolean(2, status); 
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2)); 
                user.setPassword(rs.getString(3)); 
                user.setUserType(rs.getString(4)); 
                user.setFirstName(rs.getString(5)); 
                user.setLastName(rs.getString(6)); 
                user.setEmail(rs.getString(7)); 
                user.setMobile(rs.getString(8)); 
                user.setRegiDate(rs.getDate(9)); 
                user.setStatus(rs.getBoolean(10)); 
                list.add(user); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReportService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list; 
    } 
}
