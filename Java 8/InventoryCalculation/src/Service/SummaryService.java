package Service;

import Connection.MyConnection;
import Domain.ProductCategory;
import Domain.Purchase;
import Domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {

    static Connection conn = MyConnection.getConnection();

    public static void createTable() {
        String sql = "create table summary(id int auto_increment primary key, productName varchar(50) not null,productCode varchar(30) not null, totalQty int(11) not null,soldQty int(11) not null,availableQty int(11) not null,lastUpdate Date, product_id int(11) not null, foreign key (product_id) references purchase(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Summary Table Created");
        } catch (Exception e) {
        }
    }

    public static void insert(Summary summary) {
        String sql = "insert into summary(productName,productCode, totalQty,soldQty,availableQty,lastUpdate, product_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getProductName());
            ps.setString(2, summary.getProductCode());
            ps.setInt(3, summary.getTotalqty());
            ps.setInt(4, summary.getSoldqty());
            ps.setInt(5, summary.getAvailableqty());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(7, summary.getPurchase().getId());
            ps.executeUpdate();
            System.out.println("Data Inserted! in Summary");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public static void update(Summary summary) {
        String sql = "update summary set totalQty=?,soldQty=?,availableQty=?,lastUpdate=? where productCode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getTotalqty());
            ps.setInt(2, summary.getSoldqty());
            ps.setInt(3, summary.getAvailableqty());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setString(5, summary.getProductCode());

            ps.executeUpdate();
            System.out.println("Data Updated in Summary!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Purchase getpurchaseByProductCode(String productCode) {
        Purchase p = new Purchase();
        String sql = "select * from purchase where productCode = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ps.setString(1, productCode);

            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setProductCode(rs.getString(3));
                p.setQty(rs.getInt(4));
                p.setUnitProce(rs.getDouble(5));
                p.setTotalProce(rs.getDouble(6));
                p.setPurchaseDate(rs.getDate(7));
                ProductCategory c = new ProductCategory();
                c.setId(rs.getInt(8));
                p.setCategory(c);

            }
        } catch (Exception e) {
        }
        return p;
    }

    public static Summary getSummaryByProductCode(String productCode) {
        Summary summary = new Summary();
        String sql = "select * from summary where productCode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                summary.setId(rs.getInt(1));
                summary.setProductName(rs.getString(2));
                summary.setProductCode(rs.getString(3));
                summary.setTotalqty(rs.getInt(4));
                summary.setSoldqty(rs.getInt(5));
                summary.setAvailableqty(rs.getInt(6));
                summary.setLastUpdate(rs.getDate(7));
                Purchase p = new Purchase();
                p.setId(rs.getInt(8));
                summary.setPurchase(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }
}
