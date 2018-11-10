
package DataCrudOperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTable {
    
    private static final Connection conn = MyConnection.getConnection();
    
    public static void createTables() {
        String sql ="create table category(id int(10) primary key auto_increment,name varchar(15))";
        
        try {
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void productTable() {
        String sql ="create table product(p_id int(10) primary key auto_increment,name varchar(15),qty int(10),unit_price double,total_price double,purchase_date Date,cat_id int(10),constraint foreign key (cat_id) references category(id))";        
        try {
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
//    public static void main(String[] args) {
//        productTable();
//    }
}
