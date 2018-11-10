
package DataCrudOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public static void proInsert(Product p) {
        String sql = "insert into product(p_id,name,qty,unit_price,total_price,purchase_date,cat_id)values(?,?,?,?,?,?,?)";
        
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
}
