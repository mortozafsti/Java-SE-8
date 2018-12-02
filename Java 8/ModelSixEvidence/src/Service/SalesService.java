package Service;

import Connection.MyConnection;
import Model.Purchase;
import Model.Sales;
import Model.Summary;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalesService {

    public static Connection conn = MyConnection.getConnection();

    public static void CreateTableSales() {

        String sql = "create table sales(id int auto_increment primary key,pname varchar(20) not null,"
                + "pcode varchar(20) not null,qty int(20) not null,uprice double not null,tprice double not null,"
                + "sdate Date not null,P_id int(11) not null, foreign key (P_id) references purchase(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            System.out.println("Sales Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void insertSales(Sales sales) {

        String sql = "insert into sales(pname,pcode,qty,uprice,tprice,sdate,P_id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, sales.getProductName());
            ps.setString(2, sales.getProductCode());
            ps.setInt(3, sales.getQty());
            ps.setDouble(4, sales.getUnitPrice());
            ps.setDouble(5, sales.getTotalPrice());
            ps.setDate(6, new java.sql.Date(sales.getSalesDate().getTime()));
            ps.setInt(7, sales.getPurchase().getId());
           

            System.out.println("Sales Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void InsertForSales(Sales sales) {
        if (sales != null) {
             Summary summary = SummaryService.getSummaryByProductCode(sales.getProductCode());
             if (summary.getAvailableQty() >= sales.getQty()) {
                 insertSales(sales);
                 
                 int soldQty = summary.getSoldQty() + sales.getQty();
                 int availQty = summary.getAvailableQty() - sales.getQty();
                 
                 summary.setSoldQty(soldQty);
                 summary.setAvailableQty(availQty);
                 summary.setLastUpdate(new Date()); 
                 
                 SummaryService.update(summary); 
            }else{ 
                 System.out.println("Dont Have A Enough Product");
             }
        }
    }
}
