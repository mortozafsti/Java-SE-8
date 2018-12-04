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

public class UserService {
    
    static Connection conn = MyConnection.getConnectin();

    public static void createTable() {
        String sql = "create table user(id int auto_increment primary key,username varchar(30) not null,password varchar(30) not null,"
                + "usertype varchar(30) not null,gender varchar(30) not null,mobileno varchar(11) not null,nid varchar(30) not null,"
                + "address varchar(30) not null,admitfee int(30) not null,regiDate Date,status bit)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("User Table is Created");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertUser(User user) {
        String sql = "insert into user(username,password,usertype,gender,mobileno,nid,address,admitfee,regiDate,status)values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getUsertype());
            ps.setString(4, user.getGender());
            ps.setString(5, user.getMobileno());
            ps.setString(6, user.getNid());
            ps.setString(7, user.getAddress());
            ps.setString(8, user.getAdmitfee());
            ps.setDate(9, new java.sql.Date(user.getRegiDate().getTime()));
            ps.setBoolean(10, user.isStatus()); 
            ps.executeUpdate();
            System.out.println("Successfully Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static User getUserByName(String username,String password,boolean status) {
        User user = new User();
        String sql = "select * from user where username= ? and password= ? and status=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setBoolean(3, status);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               user.setId(rs.getInt(1));
               user.setUsername(rs.getString(2)); 
               user.setPassword(rs.getString(3)); 
               user.setUsertype(rs.getString(4)); 
               user.setGender(rs.getString(5)); 
               user.setMobileno(rs.getString(6)); 
               user.setNid(rs.getString(7)); 
               user.setAddress(rs.getString(8)); 
               user.setAdmitfee(rs.getString(9)); 
               user.setRegiDate(rs.getDate(10)); 
               user.setStatus(rs.getBoolean(11));  
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    public static List<User> getAllUserList() {
        List<User> list = new ArrayList<>();
        String sql ="select * from user";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setUsertype(rs.getString(4));
                user.setGender(rs.getString(5));
                user.setMobileno(rs.getString(6));
                user.setNid(rs.getString(7));
                user.setAddress(rs.getString(8));
                user.setAdmitfee(rs.getString(9));
                user.setRegiDate(rs.getDate(10)); 
                
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
