
package service;

import connection.MyConnection;
import domain.Summary;
import domain.purchase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SummaryService {
    
    public static Connection conn = MyConnection.getConnection();
    
    public static void createTableSummary() {
        String sql = "create table summary(id int auto_increment primary key,pname varchar(30) not null,"
                + " pcode varchar(30) not null,totalQty int(11) not null,soldQty int(11) not null,availQty int(11) not null,"
                + " lastUpdate Date,P_id int(11) not null, foreign key (P_id) references product (id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Product table Created");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertSummary(Summary summary) {
        String sql = "insert into summary(pname,pcode,totalQty,soldQty,availQty,lastUpdate,P_id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, summary.getPname());
            ps.setString(2, summary.getPcode());
            ps.setInt(3, summary.getTotalQty());
            ps.setDouble(4, summary.getSoldQty());
            ps.setDouble(5, summary.getAvailQty());
            ps.setDate(6, new java.sql.Date(summary.getLastUpdate().getTime())); 
            ps.setInt(7, summary.getPurchase().getId());
            
            ps.executeUpdate();
            System.out.println("Summary table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateSummary(Summary summary) {
        String sql = "update summary set totalQty =?,soldQty =?,availQty =?,lastUpdate = ? where pcode =?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, summary.getTotalQty());
            ps.setInt(2, summary.getSoldQty());
            ps.setInt(3, summary.getAvailQty());
            ps.setDate(4, new java.sql.Date(summary.getLastUpdate().getTime())); 
            ps.setString(5, summary.getPcode());
            
            ps.executeUpdate();
            System.out.println("Summary table Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Summary getSummaryByProductCode(String pcCode) {
        Summary summary = new Summary();
        String sql = "select *from summary where pcode = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pcCode);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               summary.setId(rs.getInt(1));
               summary.setPname(rs.getString(2));
               summary.setPcode(rs.getString(3));
               summary.setTotalQty(rs.getInt(4));
               summary.setSoldQty(rs.getInt(5));
               summary.setAvailQty(rs.getInt(6));
               summary.setLastUpdate(rs.getDate(7)); 
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }
    
    public static void main(String[] args) {
        createTableSummary();
    }
}
