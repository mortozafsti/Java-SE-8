package Invebtory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductUtils {

    private static final Connection conn = MyConnection.getConnection();

    public static void insert(Catagory c) {
        String sql = "insert into Catagory(id,name) values(?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, c.getId());
            ps.setString(2, c.getName());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public static void insertProduct(Product p) {
        String sql = "insert into Product(id,name,qty,unitPrice,totalPrice,purchaseDate,catId) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setInt(3, p.getQty());
            ps.setDouble(4, p.getUnitPrice());
            ps.setDouble(5, p.getTotalproce());
            ps.setDate(6, new java.sql.Date(p.getPruchaseDate().getDate()));
            ps.setInt(7, p.getCatagory().getId());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void insertPractice(Service s) {
        String sql = "insert into service(sid,name,unitPrice,totalPrice,purchaseDate,catId,pid) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setInt(1, s.getSid());
            ps.setString(2, s.getName());
            ps.setDouble(3, s.getUnitPrice());
            ps.setDouble(4, s.getTotalproce());
            ps.setDate(5, new java.sql.Date(s.getPruchaseDate().getDate()));
            ps.setInt(6, s.getCatagory().getId());
            ps.setInt(7, s.getProduct().getId());
            
            ps.executeUpdate();
            System.out.println("Inserted Service");
        } catch (Exception e) {
        }
    }
}
