
package Service;

import Connection.MyConnection;
import Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserService {
    
    static Connection con = MyConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table user(id int auto_increment primary key , username varchar(30),  password varchar(30) not null,  firstName varchar(30),  lastName varchar(30),  email varchar(30) not null,  mobile varchar(30) not null, regiDate Date, status bit)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
        }
    }
    public  void insert(User user) {
        String sql = "insert into user (username ,  password ,  firstName ,  lastName ,  email ,  mobile   , regiDate , status )values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getEmail());
            ps.setString(6, user.getMobile());
            ps.setDate(7, new java.sql.Date(user.getRegiDate().getTime()));
            ps.setBoolean(8, user.isStatus());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static User getUserByName(String username, String password) {
        User user =null;
        String sql ="select * from user where username = ? and password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            ps.setString(1,username);
            ps.setString(2,password);
            
            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt(1)); 
                user.setUsername(rs.getString(2)); 
                user.setPassword(rs.getString(3)); 
                user.setFirstName(rs.getString(4)); 
                user.setLastName(rs.getString(5)); 
                user.setEmail(rs.getString(6)); 
                user.setMobile(rs.getString(7)); 
                user.setRegiDate(rs.getDate(8)); 
                user.setStatus(rs.getBoolean(9)); 
                
            }
        } catch (Exception e) {
        }
        return user;
    }
}
