package Service;

import Connection.MyConnection;
import Domain.ProductCategory;
import Domain.Purchase;
import Domain.Summary;
import Domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseService {

    static Connection con = MyConnection.getConnection();

    public static void createTable() {
        String sql = "create table purchase(id int auto_increment primary key , productName varchar(30),  productCode varchar(30) not null,  qty int(30),  unitProce double not null,  totalProce double not null,  purchaseDate Date, Cat_id int(11) not null,foreign key (Cat_id) references Category(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("purchase Table Created");
        } catch (Exception e) {
        }
    }

    public static void insert(Purchase p) {
        String sql = "insert into purchase (productName ,productCode , qty ,unitProce ,totalProce ,purchaseDate,Cat_id)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductCode());
            ps.setInt(3, p.getQty());
            ps.setDouble(4, p.getUnitProce());
            ps.setDouble(5, p.getTotalProce());
            ps.setDate(6, new java.sql.Date(p.getPurchaseDate().getTime()));
            ps.setInt(7, p.getCategory().getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Purchase getpurchaseByProductCode(String productCode) {
        Purchase p = new Purchase();
        String sql = "select * from purchase where productCode = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            ps.setString(1, productCode);

            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setProductName(rs.getString(2));
                p.setProductCode(rs.getString(3));
                p.setQty(rs.getInt(4));
                p.setUnitProce(rs.getDouble(5));
                p.setTotalProce(rs.getDouble(6));
                p.setPurchaseDate(rs.getDate(7));
                ProductCategory c = new ProductCategory();
                c.setId(rs.getInt(8));
                p.setCategory(c);

            }
        } catch (Exception e) {
        }
        return p;
    }

    public static void insertMain(Purchase purchase) {
        
        if (purchase != null) {
            //insert(purchase);
            
            Purchase p = getpurchaseByProductCode(purchase.getProductCode()); 
            
            try {
                Summary summary = SummaryService.getSummaryByProductCode(purchase.getProductCode());
                if (purchase.getProductCode().equalsIgnoreCase(summary.getProductCode())) {
                    int totalQty = summary.getTotalqty() + purchase.getQty();
                    int availQty = summary.getAvailableqty() +purchase.getQty();
                    summary.setTotalqty(totalQty);
                    summary.setAvailableqty(availQty);
                    summary.setLastUpdate(new Date()); 
                    
                }
                SummaryService.update(summary); 
            } catch (Exception e) {
                Summary summary1 = new Summary(purchase.getProductName(), purchase.getProductCode(), purchase.getQty(), 0, purchase.getQty(), new Date(), p);
                SummaryService.insert(summary1); 
            }
            
        }
        

    }
}
