package service;

import connection.MySqlConnection;
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

    public static Connection conn = MySqlConnection.getConnection();

    public static void createTablePurchase() {
        String sql = "create table purchase(id int auto_increment primary key,pname varchar(15),"
                + "price double not null,date Date)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Purchase Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertPurchase(Purchase purchase) {
        String sql = "insert into purchase(pname,price,date)values(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getP_name());
            ps.setDouble(2, purchase.getPrice());
            ps.setDate(3, new java.sql.Date(purchase.getP_date().getTime()));
            ps.executeUpdate();
            System.out.println("Purchase Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updatePurchase(Purchase purchase) {
        String sql = "update purchase set pname=?,price=?,date=? where id =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, purchase.getP_name());
            ps.setDouble(2, purchase.getPrice());
            ps.setDate(3, new java.sql.Date(purchase.getP_date().getTime()));
            ps.setInt(4, purchase.getId());
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
        List<Purchase> list = new ArrayList<>();
        String sql = "select * from purchase";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Purchase p = new Purchase();
                p.setId(rs.getInt(1));
                p.setP_name(rs.getString(2));
                p.setPrice(rs.getDouble(3));
                p.setP_date(rs.getDate(4));

                list.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public static ResultSet showDataById(int id) {
        ResultSet rs = null;
        String sql = "select * from purchase where id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            System.out.println("Show data");
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

//    public static Purchase showDataById(int id) {
//        Purchase purchase = new Purchase();
//        String sql = "select * from purchase where id = ?";
//
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//              
//                purchase.setId(rs.getInt(1));
//                purchase.setP_name(rs.getString(2));
//                purchase.setPrice(rs.getDouble(3));
//                purchase.setP_date(rs.getDate(4));
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return purchase;
//    }

}
