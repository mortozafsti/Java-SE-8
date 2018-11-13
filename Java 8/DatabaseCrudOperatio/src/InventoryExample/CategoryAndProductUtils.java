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
                list.add(new Category(rs.getInt(1), rs.getString(2)));

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
                list.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getDate(6), category));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void SummaryInsert(Summary s) {
        String sql = "insert into summary(total_qty,sold_qty,available_qty,product_id)values(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getTotalQty());
            ps.setInt(2, s.getSoldQty());
            ps.setInt(3, s.getAvailableQty());
            ps.setInt(4, s.getProduct().getP_id());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void SummaryUpdate(Summary s) {
        String sql = "update summary set total_qty =?,sold_qty =?,available_qty =? where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getTotalQty());
            ps.setInt(2, s.getSoldQty());
            ps.setInt(3, s.getAvailableQty());
            ps.setInt(4, s.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Summary getSummaryById(int pid) {
        Summary summary = null;
        String sql = "select * from summary where product_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                summary = new Summary(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4)); 
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }
    public static Product getProductByName(String  pName) {
        Product product = new Product();
        String sql = "select * from product where p_name = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { 
                product.setP_id(rs.getInt(1));
                product.setP_name(rs.getString(2)); 
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CategoryAndProductUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    public static void dataInsertorUpdateIntoProductAndSummary(Product p) {
      
        
        Product product = getProductByName(p.getP_name());
        
        int totalQty = 0;
        int availableQty = 0;
        
        if (p.getP_id() != 0) { 
            Summary sumFromDB = getSummaryById(p.getP_id());
            
            totalQty = sumFromDB.getTotalQty() + p.getP_qty();
            availableQty = totalQty - sumFromDB.getSoldQty();
            
            Summary summary = new Summary(sumFromDB.getId(), totalQty, 0, availableQty);
            SummaryUpdate(summary);
            
        }else{ 
            Summary  summary1 = new Summary(product,p.getP_qty(),0,p.getP_qty());
            SummaryInsert(summary1);
            
        }
    }

    
}
