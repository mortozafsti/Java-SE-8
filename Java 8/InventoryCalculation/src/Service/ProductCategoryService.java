
package Service;

import Connection.MyConnection;
import Domain.ProductCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductCategoryService {
    
    public static Connection conn = MyConnection.getConnection();
    
    public static void CreateTable() {
        String sql = "create table category(id int auto_increment primary key,name varchar(30) not null)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Create Table Category");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertCat(ProductCategory cat) {
        String sql = "insert into category(name)values(?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cat.getName());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
