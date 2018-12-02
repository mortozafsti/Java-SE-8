
package Service;

import Connection.MyConnection;
import Model.Purchase;
import Model.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {
    
   public static Connection conn = MyConnection.getConnection();
   
    public static void createTablePurchase() {

        String sql = "create table purchase(id int auto_increment primary key,pname varchar(30) not null,"
                + "pcode varchar(30) not null,qty int(10) not null,uprice double,tprice double,pdate Date)";
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.execute();
           
           System.out.println("Purchase Table Created");
       } catch (SQLException ex) {
           Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public static void insertPurchase(Purchase purchase) {
        String sql = "insert into purchase(pname,pcode,qty,uprice,tprice,pdate)values(?,?,?,?,?,?)";
       try {
           PreparedStatement ps = conn.prepareStatement(sql);
           
           ps.setString(1, purchase.getProductName());
           ps.setString(2, purchase.getProductCode());
           ps.setInt(3, purchase.getQty());
           ps.setDouble(4, purchase.getUnitPrice());
           ps.setDouble(5, purchase.getTotalPrice());
           ps.setDate(6, new java.sql.Date(purchase.getPurchaseDate().getTime())); 
           
           ps.executeUpdate();
           System.out.println("Successfully Inserted");
       } catch (SQLException ex) {
           Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public static Purchase getPurchaseByProductCode(String productCode) {
        Purchase purchase = new Purchase();
        String sql = "select * from purchase where pcode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                purchase.setId(rs.getInt(1));
                purchase.setProductName(rs.getString(2));
                purchase.setProductCode(rs.getString(3));
                purchase.setQty(rs.getInt(4));
                purchase.setUnitPrice(rs.getDouble(5));
                purchase.setTotalPrice(rs.getDouble(6));
                purchase.setPurchaseDate(rs.getDate(7));           
              

            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    public static void insertMain(Purchase purchase) {
        if (purchase != null) {
            insertPurchase(purchase);
            Purchase p = getPurchaseByProductCode(purchase.getProductCode());

            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getProductCode());
                if (purchase.getProductCode().equalsIgnoreCase(summary.getProductCode())) {
                    int totalQty = summary.getTotalQty() + purchase.getQty();
                    int avilQty = summary.getAvailableQty() + purchase.getQty();
                    summary.setTotalQty(totalQty);
                    summary.setAvailableQty(avilQty);
                    summary.setLastUpdate(new Date());
                }
                SummaryService.update(summary);

            } catch (NullPointerException e) {

                Summary summary3 = new Summary(purchase.getProductName(), purchase.getProductCode(), purchase.getQty(), 0, purchase.getQty(), new Date(), p);
                SummaryService.insertSummary(summary3);

            }

        }
    }
    
}
