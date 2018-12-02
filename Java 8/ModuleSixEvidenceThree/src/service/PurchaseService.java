
package service;

import connection.MyConnection;
import domain.Summary;
import domain.purchase;
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
        String sql = "create table product(id int auto_increment primary key,pname varchar(30) not null,"
                + " pcode varchar(30) not null,qty int(11) not null,uprice double not null,tprice double not null,"
                + " pdate Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Product table Created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertProduct(purchase purchase) {
        String sql = "insert into product(pname,pcode,qty,uprice,tprice,pdate)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getPname());
            ps.setString(2, purchase.getPcode());
            ps.setInt(3, purchase.getQty());
            ps.setDouble(4, purchase.getUprice());
            ps.setDouble(5, purchase.getTprice());
            ps.setDate(6, new java.sql.Date(purchase.getPdate().getTime())); 
            
            ps.executeUpdate();
            System.out.println("Product table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static purchase getPurchaseByProductCode(String pcCode) {
        purchase purchase = new purchase();
        String sql = "select *from product where pcode = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pcCode);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               purchase.setId(rs.getInt(1));
               purchase.setPname(rs.getString(2));
               purchase.setPcode(rs.getString(3));
               purchase.setQty(rs.getInt(4));
               purchase.setUprice(rs.getDouble(5));
               purchase.setTprice(rs.getDouble(6));
               purchase.setPdate(rs.getDate(7)); 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }
    public static void insertMain(purchase purchase) {
        if (purchase != null) {
            insertProduct(purchase);
            
            purchase p = getPurchaseByProductCode(purchase.getPcode());
            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getPcode());
                if (purchase.getPcode().equalsIgnoreCase(summary.getPcode())) {
                    int totalQty = summary.getTotalQty() + purchase.getQty();
                    int availQty = summary.getAvailQty()+ purchase.getQty();
                    
                    summary.setTotalQty(totalQty);
                    summary.setAvailQty(availQty);
                    summary.setLastUpdate(new Date()); 
                }
                SummaryService.updateSummary(summary); 
                
            } catch (Exception e) {
                Summary summary2 = new Summary(purchase.getPname(), purchase.getPcode(), purchase.getQty(), 0, purchase.getQty(), new Date(), p);
                SummaryService.insertSummary(summary2); 
            }
        }
        
    }
    public static void main(String[] args) {
        createTableProduct();
    }
}
