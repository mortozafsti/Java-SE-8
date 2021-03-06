
package Service;

import Connection.MyConnection;
import Model.Purchase;
import Model.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {
    
    public static Connection conn = MyConnection.getConnection();
    
     public static void CreateTableSales() {

        String sql = "create table summary(id int auto_increment primary key,pname varchar(30) not null,"
                + "pcode varchar(30) not null,totalQty int(11) not null,soldQty int(11) not null,"
                + "availQty int(11) not null,lastUpdate Date,P_Id int(11) not null, foreign key (P_Id) "
                + "references purchase (id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();

            System.out.println("Summary Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void insertSummary(Summary summary) {

        String sql = "insert into summary(pname,pcode,totalQty,soldQty,availQty,lastUpdate,P_Id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getProductName());
            ps.setString(2, summary.getProductCode());
            ps.setInt(3, summary.getTotalQty());
            ps.setInt(4, summary.getSoldQty());
            ps.setInt(5, summary.getAvailableQty());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setInt(7, summary.getPurchase().getId()); 
            
            ps.executeUpdate();
            System.out.println("Successfully Inserted Summary");

            System.out.println("Summary Table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SalesService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void update(Summary summary) {
        String sql = "update summary set totalQty=?, soldQty=?, availQty=?, lastUpdate=? where pcode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, summary.getTotalQty());
            ps.setInt(2, summary.getSoldQty());
            ps.setInt(3, summary.getAvailableQty());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime()));
            ps.setString(5, summary.getProductCode());
            
            ps.executeUpdate();
            System.out.println("Data Updated successfully in Summary  ");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public static Summary getSummaryByProductCode(String productCode) {
        Summary summary = new Summary();
        String sql = "select * from summary where pcode=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productCode);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                summary.setId(rs.getInt(1));
                summary.setProductName(rs.getString(2));
                summary.setProductCode(rs.getString(3));
                summary.setTotalQty(rs.getInt(4));
                summary.setSoldQty(rs.getInt(5));
                summary.setAvailableQty(rs.getInt(6));
                summary.setLastUpdate(rs.getDate(7));
                Purchase p = new Purchase();
                p.setId(rs.getInt(8));
                summary.setPurchase(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }
     
}
