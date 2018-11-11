
package DataCrudOperation;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CatAndproUtils {
    
    private static final Connection conn = MyConnection.getConnection();
    
    public static void catInsert(Category c) {
        String sql = "insert into category(id,name)values(?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void catUpdate(Category c) {
        String sql = "update category set name = ? where id = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, c.getName());
            ps.setInt(2, c.getId());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void proUpdate(Product p) {
        String sql = "update products set name = ?,qty = ?,unit_price = ?,total_price = ?,purchase_date = ?,cat_id = ? where p_id = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, p.getName());
            ps.setInt(2, p.getQty());
            ps.setDouble(3, p.getUnit_price());
            ps.setDouble(4, p.getTotal_price());
            ps.setDate(5, (Date) p.getPurchase_date());
            ps.setInt(6, p.getCategory().getId());
            ps.setInt(7, p.getP_id());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void proInsert(Product p) {
        String sql = "insert into products(p_id,name,qty,unit_price,total_price,purchase_date,cat_id)values(?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, p.getP_id());
            ps.setString(2, p.getName());
            ps.setInt(3, p.getQty());
            ps.setDouble(4, p.getUnit_price());
            ps.setDouble(5, p.getTotal_price());
            ps.setDate(6, new java.sql.Date(p.getPurchase_date().getDate()));
            ps.setInt(7, p.getCategory().getId());            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static List<Product> showData() {
        
        List<Product> pro = new ArrayList<>();
        String sql = "select * from products";
       
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c=new Category();
                c.setId(rs.getInt(7));
               pro.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDouble(5),rs.getDate(6),c));
                
            }
            
            //ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }
    public static List<Category> showDataCat() {
        
        List<Category> pro = new ArrayList<>();
        String sql = "select * from category";
       
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
               pro.add(new Category(rs.getInt(1),rs.getString(2)));
                
            }
            
            //ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pro;
    }
    public static ResultSet DatagetById(int id) {
        
        ResultSet rs = null;
        String sql = "select * from category where id = ?";
       
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id); 
            
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static ResultSet DatagetByIdPro(int id) {
        
        ResultSet rs = null;
        String sql = "select * from products where p_id = ?";
       
        try {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id); 
            
            rs = ps.executeQuery();
            System.out.println("Data show    jj");

        } catch (SQLException ex) {
            Logger.getLogger(CatAndproUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
