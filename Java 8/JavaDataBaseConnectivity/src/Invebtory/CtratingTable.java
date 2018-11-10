package Invebtory;

import JdbcCruedOperation.CreateTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CtratingTable {

    private static final Connection conn = MyConnection.getConnection();

    public static void CatagoryTable() {

        String sql = "create table Catagory(id int(10) primary key,name varchar(15))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {

        }
    }

    public static void ProductTable() {

        String sql = "create table Product(id int(10) primary key,name varchar(15),qty int(10),unitPrice double,totalPrice double,purchaseDate Date,catId int(10), constraint cat_product  foreign key (catId) references Catagory(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Created");
        } catch (Exception e) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void practise() {

        String sql = "create table service(sid int(10) auto_increment primary key,name varchar(15),unitPrice double,totalPrice double,purchaseDate Date,catId int(10), constraint foreign key (catId) references catagory(id),pid int(10),constraint foreign key (pid) references product(id))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Created");
        } catch (Exception e) {
            Logger.getLogger(CreateTable.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void main(String[] args) {
        practise();
    }
}
