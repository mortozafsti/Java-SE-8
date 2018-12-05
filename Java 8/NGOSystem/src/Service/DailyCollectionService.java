package Service;

import Connection.MyConnection;
import Domain.AddMember;
import Domain.DailyCollection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DailyCollectionService {
    
    static Connection conn = MyConnection.getConnectin();

    public static void createTableDailyCollection() {
        String sql = "create table dailyCollection(id int auto_increment primary key,name varchar(30) not null,"
                + "gender varchar(30) not null,address varchar(30) not null,Amount double(30) not null, collectionDate Date,"
                + "m_code varchar(10) not null,foreign key(m_code) references member(mcode),day int(11),month int(11),year int(11))";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            System.out.println("Collection Table is Created");
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void insertCollection(DailyCollection collection) {
        String sql = "insert into dailyCollection(name,gender,address,Amount,collectionDate,m_code,day,month,year)values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, collection.getName());
            ps.setString(2, collection.getGender());
            ps.setString(3, collection.getAddress());
            ps.setDouble(4, collection.getCollectionAmount());
            ps.setDate(5, new java.sql.Date(collection.getCollectionDate().getTime()));
            ps.setString(6, collection.getAddMember().getMcode());
            ps.setInt(7, collection.getDay());
            ps.setInt(8, collection.getMonth());
            ps.setInt(9, collection.getYear());
            
            ps.executeUpdate();
            System.out.println("Successfully Inserted into Collection");
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static List<DailyCollection> getDailyCollectionByMonth(int month) {
        List<DailyCollection> list = new ArrayList<>();
        String sql = " select * from dailycollection where month=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, month); 
    
        
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DailyCollection dc = new DailyCollection();
                dc.setId(rs.getInt(1)); 
                dc.setName(rs.getString(2));
                dc.setGender(rs.getString(3));
                dc.setAddress(rs.getString(4));
                dc.setCollectionAmount(rs.getDouble(5));            
                dc.setCollectionDate(rs.getDate(6));
                AddMember addMember=new AddMember();
                addMember.setMcode(rs.getString(7));
                    dc.setAddMember(addMember);
                dc.setDay(rs.getInt(8));
                dc.setMonth(rs.getInt(9));
                dc.setYear(rs.getInt(10));
                
                list.add(dc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static List<DailyCollection> getDailyCollectionByMonthAndMCode(int month,String mcode) {
        List<DailyCollection> list = new ArrayList<>();
        String sql = " select * from dailycollection where month=? and m_code=?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, month); 
            ps.setString(2, mcode);
        
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DailyCollection dc = new DailyCollection();
                dc.setId(rs.getInt(1)); 
                dc.setName(rs.getString(2));
                dc.setGender(rs.getString(3));
                dc.setAddress(rs.getString(4));
                dc.setCollectionAmount(rs.getDouble(5));            
                dc.setCollectionDate(rs.getDate(6));
                AddMember addMember=new AddMember();
                addMember.setMcode(rs.getString(7));
                    dc.setAddMember(addMember);
                dc.setDay(rs.getInt(8));
                dc.setMonth(rs.getInt(9));
                dc.setYear(rs.getInt(10));
                
                list.add(dc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public static List<DailyCollection> getDailyCollectionList() {
        
        List<DailyCollection> list = new ArrayList<>();
        String sql = "select * from dailycollection";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DailyCollection dc = new DailyCollection();
                dc.setId(rs.getInt(1));
                dc.setName(rs.getString(2));
                dc.setGender(rs.getString(3));
                dc.setAddress(rs.getString(4));
                dc.setCollectionAmount(rs.getDouble(5));
                dc.setCollectionDate(rs.getDate(6)); 
                
                AddMember addMember = new AddMember();
                addMember.setMcode(rs.getString(7));
                dc.setAddMember(addMember); 
                
                list.add(dc);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DailyCollectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list; 
    }
    
//    public static void main(String[] args) {
//        createTableDailyCollection();
//    }
    
//    public static User getUserByName(String username,String password,boolean status) {
//        User user = new User();
//        String sql = "select * from user where username= ? and password= ? and status=? ";
//        try {
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, username);
//            ps.setString(2, password);
//            ps.setBoolean(3, status);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//               user.setId(rs.getInt(1));
//               user.setUsername(rs.getString(2)); 
//               user.setPassword(rs.getString(3)); 
//               user.setUsertype(rs.getString(4)); 
//               user.setGender(rs.getString(5)); 
//               user.setMobileno(rs.getString(6)); 
//               user.setNid(rs.getString(7)); 
//               user.setAddress(rs.getString(8)); 
//               user.setAdmitfee(rs.getString(9)); 
//               user.setRegiDate(rs.getDate(10)); 
//               user.setStatus(rs.getBoolean(11));  
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(AddMemberService.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return user;
//    }
}
