package service;

import connection.MyConnection;
import domain.Purchase;
import domain.Sales;
import domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {

    public static Connection conn = MyConnection.getConnection();

    public static void createTableSales() {
        String sql = "create table sales(id int auto_increment primary key,pname varchar(15) not null,"
                + "pcode varchar(15) not null,pqty int(20) not null,uprice double not null,"
                + "tprice double not null,sdate Date,P_id int(11) not null,foreign key (P_id) references product (id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Sales Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertSales(Sales sales) {
        String sql = "insert into sales(pname,pcode,pqty,uprice,tprice,sdate,P_id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, sales.getProductName());
            ps.setString(2, sales.getProductCode());
            ps.setInt(3, sales.getProductQty());
            ps.setDouble(4, sales.getUnitPrice());
            ps.setDouble(5, sales.getTotalPrice());
            ps.setDate(6, new java.sql.Date(sales.getSalesDate().getTime()));
            ps.setInt(7, sales.getPurchase().getId());

            ps.executeUpdate();
            System.out.println("Sales Table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static Purchase getProductByProductCode(String pcCode) {
//        Purchase purchase = new Purchase();
//        String sql = "select * from product where pcode =?";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            
//            ps.setString(1, pcCode);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                purchase.setId(rs.getInt(1));
//                purchase.setProductName(rs.getString(2));
//                purchase.setProductCode(rs.getString(3));
//                purchase.setProductQty(rs.getInt(4));
//                purchase.setUnitPrice(rs.getDouble(5));
//                purchase.setTotalPrice(rs.getDouble(6));
//                purchase.setPurchaseDate(rs.getDate(7)); 
//                
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return purchase;
//    }

    public static void insertForSale(Sales sales) {
        if (sales != null) {
            Summary summary = SummaryService.getSummaryByProductCode(sales.getProductCode());
            if (summary.getAvailQty() >= sales.getProductQty()) {
                insertSales(sales);

                int soldQty = summary.getSoldQty() + sales.getProductQty();
                int availQty = summary.getAvailQty() - sales.getProductQty();

                summary.setSoldQty(soldQty);
                summary.setAvailQty(availQty);
                summary.setLastUpDate(new Date());

                SummaryService.updateSummary(summary);

            } else {
                System.out.println("Not Enough product");
            }
        }
    }
    public static void main(String[] args) {
        createTableSales();
    }

}
