
package service;

import connection.MyConnection;
import domain.Purchase;
import domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {
    public static Connection conn = MyConnection.getConnection();
    
    public static void createTableProduct() {
        String sql = "create table product(id int auto_increment primary key,pname varchar(15) not null,"
                + "pcode varchar(15) not null,pqty int(20) not null,uprice double not null,"
                + "tprice double not null,pdate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Product Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertProduct(Purchase purchase) {
        String sql = "insert into product(pname,pcode,pqty,uprice,tprice,pdate)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, purchase.getProductName());
            ps.setString(2, purchase.getProductCode());
            ps.setInt(3, purchase.getProductQty());
            ps.setDouble(4, purchase.getUnitPrice());
            ps.setDouble(5, purchase.getTotalPrice());
            ps.setDate(6, new java.sql.Date(purchase.getPurchaseDate().getTime()));
            
            ps.executeUpdate();
            System.out.println("Product Table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Purchase getProductByProductCode(String pcCode) {
        Purchase purchase = new Purchase();
        String sql = "select * from product where pcode =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, pcCode);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setProductName(rs.getString(2));
                purchase.setProductCode(rs.getString(3));
                purchase.setProductQty(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotalPrice(rs.getDouble(6));
                purchase.setPurchaseDate(rs.getDate(7)); 
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    public static Purchase insertMain(Purchase purchase) {
        if (purchase != null) {
            insertProduct(purchase);
            
            Purchase p = getProductByProductCode(purchase.getProductCode());
            
            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getProductCode());
                if (purchase.getProductCode().equalsIgnoreCase(summary.getProductCode())) {
                     int totalQty = summary.getTotalQty() + purchase.getProductQty();
                     int availQty = summary.getAvailQty() + purchase.getProductQty();
                     
                     summary.setTotalQty(totalQty);
                     summary.setAvailQty(availQty);
                     summary.setLastUpDate(new Date()); 
                }
                SummaryService.updateSummary(summary); 
                
            } catch (Exception e) {
                Summary summary2 = new Summary(purchase.getProductName(), purchase.getProductCode(), purchase.getProductQty(), 0, purchase.getProductQty(), new Date(), p);
                SummaryService.insertSummary(summary2); 
            }
        }
        return purchase;
    }
    
}
