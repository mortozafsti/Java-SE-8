
package InventoryExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableUsingMysql {
    private static final Connection conn = MyConnection.getConnection();
    
    public static void createTableCat() {
        String sql = "create table category(cat_id int(10) primary key auto_increment,cat_name varchar(15))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void createTableSum() {
        String sql = "create table summary(id int(10) primary key auto_increment,total_qty int,sold_qty int,available_qty int, product_id int(10), foreign key (product_id) references product (p_id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void createTablePro() {
        String sql = "create table product(p_id int(10) primary key auto_increment,p_name varchar(10),"
                + "p_qty int(10),unit_price double,total_price double,purchase_date Date,cat_id int(10),constraint foreign key"
                + " (cat_id) references category (cat_id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            Logger.getLogger(CreateTableUsingMysql.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void main(String[] args) {
        createTableSum();
        
    }
}
