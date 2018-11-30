package Service;

import Connection.MyConnection;
import Domain.AddMember;
import Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddMemberService {
    
    static Connection conn = MyConnection.getConnectin();

    public static void createTableAddMember() {
        String sql = "create table member(id int auto_increment primary key,username varchar(30) not null,"
                + "gender varchar(30) not null,mobileno varchar(11) not null,nid varchar(30) not null,"
                + "address varchar(30) not null,admitfee int(30) not null,regiDate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Member Table is Created");
        } catch (SQLException ex) {
            Logger.getLogger(AddMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertMember(AddMember member) {
        String sql = "insert into member(username,gender,mobileno,nid,address,admitfee,regiDate)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, member.getName());
            ps.setString(2, member.getGender());
            ps.setString(3, member.getMobileno());
            ps.setString(4, member.getNid());
            ps.setString(5, member.getAddress());
            ps.setString(6, member.getAdmitfee());
            ps.setDate(7, new java.sql.Date(member.getRegiDate().getTime()));

            ps.executeUpdate();
            System.out.println("Successfully Inserted into Member");
        } catch (SQLException ex) {
            Logger.getLogger(AddMemberService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static User getUserByName(String username,String password,boolean status) {
//        User user = new User();
//        String sql = "select * from user where username= ? and password= ? and status=? ";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, username);
//            ps.setString(2, password);
//            ps.setBoolean(3, status);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//               user.setId(rs.getInt(1));
//               user.setUsername(rs.getString(2)); 
//               user.setPassword(rs.getString(3)); 
//               user.setUsertype(rs.getString(4)); 
//               user.setGender(rs.getString(5)); 
//               user.setMobileno(rs.getString(6)); 
//               user.setNid(rs.getString(7)); 
//               user.setAddress(rs.getString(8)); 
//               user.setAdmitfee(rs.getString(9)); 
//               user.setRegiDate(rs.getDate(10)); 
//               user.setStatus(rs.getBoolean(11));  
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AddMemberService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return user;
//    }
}
