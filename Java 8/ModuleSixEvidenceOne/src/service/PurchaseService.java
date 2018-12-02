
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
//    private int id;
//    private String pName;
//    private String pCode;
//    private int pqty;
//    private double uPrice;
//    private double tPrice;
//    private Date pDate;
    public static void createTableProduct() {
        String sql = "create table product(id int auto_increment primary key,pname varchar(20) not null,pcode varchar(20) not null,"
                + " qty int(20) not null,uprice double not null,tprice double not null,pdate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Product Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertProduct(Purchase purchase) {
        String sql = "insert into product(pname,pcode,qty,uprice,tprice,pdate)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getpName());
            ps.setString(2, purchase.getpCode());
            ps.setInt(3, purchase.getPqty());
            ps.setDouble(4, purchase.getuPrice());
            ps.setDouble(5, purchase.gettPrice());
            ps.setDate(6, new java.sql.Date(purchase.getpDate().getTime())); 
            
            ps.executeUpdate();
            System.out.println("Successfullu Iserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Purchase getPurchaseByProductCode(String pcode) {
        Purchase purchase = new Purchase();
        String sql = "select * from product where pcode = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, pcode);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setpName(rs.getString(2));
                purchase.setpCode(rs.getString(3));
                purchase.setpCode(rs.getString(3));
                purchase.setPqty(rs.getInt(4));
                purchase.setuPrice(rs.getDouble(5));
                purchase.settPrice(rs.getDouble(6));
                purchase.setpDate(rs.getDate(7)); 

            }           
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    public static void insertMain(Purchase purchase) {
        if (purchase != null) {
            insertProduct(purchase);
            
            Purchase p = getPurchaseByProductCode(purchase.getpCode());
            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getpCode());
                if (purchase.getpCode().equalsIgnoreCase(summary.getProductCode())) {
                     int totalQty = summary.getTotalQty() + purchase.getPqty();
                     int availQty = summary.getAvailQty()+ purchase.getPqty();
                     
                     summary.setTotalQty(totalQty);
                     summary.setAvailQty(availQty);
                     summary.setLastUpdate(new Date()); 
                     
                }
                SummaryService.updateSummary(summary); 
                
            } catch (Exception e) {
                Summary summary2 = new Summary(purchase.getpName(), purchase.getpCode(), purchase.getPqty(), 0, purchase.getPqty(), new Date(), p);
                SummaryService.insertSummary(summary2); 
            }
        }
    }
//    public static void main(String[] args) {
//        createTableProduct();
//    }
}
