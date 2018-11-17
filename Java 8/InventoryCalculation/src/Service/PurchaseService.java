
package Service;

import Connection.MyConnection;
import Domain.Purchase;
import Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {
    
    
    static Connection con = MyConnection.getConnection();
    public static void createTable() {
        String sql = "create table purchase(id int auto_increment primary key , productName varchar(30),  productCode varchar(30) not null,  qty int(30),  unitProce double(30),  totalProce double(30) not null,  purchaseDate Date)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
        }
    }
    public  void insert(Purchase p) {
        String sql = "insert into purchase (productName ,productCode , qty ,unitProce ,totalProce ,purchaseDate)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductCode());
            ps.setInt(3, p.getQty());
            ps.setDouble(4, p.getUnitProce());
            ps.setDouble(5, p.getTotalProce());          
            ps.setDate(6, new java.sql.Date(p.getPurchaseDate().getTime()));
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
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
