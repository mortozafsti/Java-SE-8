
package Service;

import Connection.MyConnection;
import Domain.Purchase;
import Domain.Sales;
import Domain.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {
    
    public static Connection conn = MyConnection.getConnection();
    
    public static void createTable() {
        String sql = "create table sales(id int(11) auto_increment primary key,productName varchar(30) not null,productCode varchar(30) not null,qty int(11) not null,unitPrice double not null,totalPrice double not null,salesDate Date not null,product_id int(11) not null, foreign key (product_id) references purchase(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertSales(Sales sales) {
        String sql = "insert into sales(productName,productCode,qty,unitPrice,totalPrice,salesDate,product_id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sales.getProductName());
            ps.setString(2, sales.getProductCode());
            ps.setInt(3, sales.getQty());
            ps.setDouble(4, sales.getUnitPrice());
            ps.setDouble(5, sales.getTotalPrice());
            ps.setDate(6, new java.sql.Date(sales.getSalesDate().getTime())); 
            ps.setInt(7, sales.getPurchase().getId());
             
            ps.executeUpdate();
            System.out.println("Data Inserted into Sales Table");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertFroSales(Sales sales) {
        if (sales != null) {
             Summary summary = SummaryService.getSummaryByProductCode(sales.getProductCode());
             if (summary.getAvailableqty() >= sales.getQty()) {
                 insertSales(sales);
                 int solQty = summary.getSoldqty() + sales.getQty();
                 int availQty = summary.getAvailableqty() - sales.getQty();
                 
                 summary.setSoldqty(solQty);
                 summary.setAvailableqty(availQty);
                 summary.setLastUpdate(new java.util.Date());  
                 
                 SummaryService.updatesummary(summary); 
            }else{ 
                 System.out.println("You do not have Sufficient Product");
             }
        }
    }
    public static List<Sales> getSalesByList() {
        List<Sales> list = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Sales sales = new Sales();
                sales.setId(rs.getInt(1));
                sales.setProductName(rs.getString(2));
                sales.setProductCode(rs.getString(3));
                sales.setQty(rs.getInt(4));
                sales.setUnitPrice(rs.getDouble(5));
                sales.setTotalPrice(rs.getDouble(6));
                sales.setSalesDate(rs.getDate(7)); 
                
                Purchase p = new Purchase();
                p.setId(rs.getInt(8));
                sales.setPurchase(p); 
                
                list.add(sales);
                
            }
            
           
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
