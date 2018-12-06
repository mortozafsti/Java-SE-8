
package service;

import connection.MysqlConnection;
import domain.Purchase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {
    
    public static Connection conn = MysqlConnection.getConnection();
  
    public static void createTablePurchase() {
        String sql = "create table purchase(id int auto_increment primary key,pname varchar(20),"
                + "pcode varchar(20), qty double not null,uprice double not null,tprice double not null,"
                + "pdate Date)";
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
  
            ps.setString(1, purchase.getP_code());
            ps.setString(2, purchase.getP_Name());
            ps.setDouble(3, purchase.getP_Qty());
            ps.setDouble(4, purchase.getU_Price());
            ps.setDouble(5, purchase.getT_Price());
            ps.setDate(6, new java.sql.Date(purchase.getP_Date().getTime())); 
            ps.executeUpdate();
            System.out.println("Purchase Table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public static void updatePurchase(Purchase purchase) {
        String sql = "update purchase set pname=?,pcode=?,qty=?,uprice=?,tprice=?,pdate=? where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
            ps.setString(1, purchase.getP_code());
            ps.setString(2, purchase.getP_Name());
            ps.setDouble(3, purchase.getP_Qty());
            ps.setDouble(4, purchase.getU_Price());
            ps.setDouble(5, purchase.getT_Price());
            ps.setDate(6, new java.sql.Date(purchase.getP_Date().getTime())); 
             ps.setInt(7, purchase.getId());
            ps.executeUpdate();
            System.out.println("Purchase Table Updated");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public static void deletePurchase(Purchase purchase) {
        String sql = "delete from purchase where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
           
           
             ps.setInt(1, purchase.getId());
             
            ps.executeUpdate();
            System.out.println("Purchase Table Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    public static List<Purchase> getPurchase() {
       List<Purchase> purchases = new ArrayList<>();
       String sql = "select * from purchase";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Purchase p = new Purchase();
                p.setId(rs.getInt(1));
                p.setP_code(rs.getString(2));
                p.setP_Name(rs.getString(3));
                p.setP_Qty(rs.getDouble(4));
                p.setU_Price(rs.getDouble(5));
                p.setT_Price(rs.getDouble(6));
                p.setP_Date(rs.getDate(7));
                
                purchases.add(p);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchases;
    }
    public static ResultSet showDatagetById(int id) {
        ResultSet rs = null;
        String sql ="select * from purchase where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            System.out.println("Show Data Successfully");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
