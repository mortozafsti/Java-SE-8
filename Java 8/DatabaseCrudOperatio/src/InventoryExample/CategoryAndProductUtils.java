
package InventoryExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryAndProductUtils {
    private static final Connection conn = MyConnection.getConnection();
    
    public static void CatInsert(Category c) {
        String sql = "insert into category(cat_name)values(?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getCat_name());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void ProInsert(Product p) {
        String sql = "insert into product(p_name,p_qty,unit_price,total_price,purchase_date,cat_id)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getP_name());
            ps.setInt(2, p.getP_qty());
            ps.setDouble(3, p.getUnit_price());
            ps.setDouble(4, p.getTotal_price());
            ps.setDate(5, new java.sql.Date(p.getPurchase_date().getTime())); 
            ps.setInt(6, p.getCategory().getCat_id()); 
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void catUpdate(Category c) {
        String sql = "update category set cat_name = ? where cat_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, c.getCat_name());
            ps.setInt(2, c.getCat_id()); 
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void proUpdate(Product p) {
        String sql = "update product set p_name = ?,p_qty = ?,unit_price = ?,total_price = ?"
                + ",purchase_date = ?,cat_id = ? where p_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getP_name());
            ps.setInt(2, p.getP_qty());
            ps.setDouble(3, p.getUnit_price());
            ps.setDouble(4, p.getTotal_price());
            ps.setDate(5, new java.sql.Date(p.getPurchase_date().getTime()));
            ps.setInt(6, p.getCategory().getCat_id());
            ps.setInt(7, p.getP_id());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static ResultSet showCatDatagetById(int id) {
        String sql = "select * from category where cat_id = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
           rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static ResultSet showProDatagetById(int id) {
        String sql = "select * from product where p_id = ?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
           rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static List<Category> showAllDataFromCategory() {
        List<Category> list = new ArrayList<>();
        String sql = "select * from category";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),rs.getString(2))); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static List<Product> showAllDataFromProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setCat_id(rs.getInt(7));  
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6),category));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
