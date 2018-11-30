package Service;

import Connection.MyConnection;
import Domain.DailyCollection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DailyCollectionService {
    
    static Connection conn = MyConnection.getConnectin();

    public static void createTableDailyCollection() {
        String sql = "create table dailyCollection(id int auto_increment primary key,name varchar(30) not null,"
                + "gender varchar(30) not null,address varchar(30) not null,Amount varchar(30) not null, collectionDate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Collection Table is Created");
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertCollection(DailyCollection collection) {
        String sql = "insert into dailyCollection(name,gender,address,Amount,collectionDate)values(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, collection.getName());
            ps.setString(2, collection.getGender());
            ps.setString(3, collection.getAddress());
            ps.setString(4, collection.getCollectionAmount());
            ps.setDate(5, new java.sql.Date(collection.getCollectionDate().getTime()));

            ps.executeUpdate();
            System.out.println("Successfully Inserted into Collection");
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
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
