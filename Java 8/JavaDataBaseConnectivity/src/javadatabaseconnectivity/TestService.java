
package javadatabaseconnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestService {
  static Connection conn = DbConnection.getConnection("xe", "hr", "hr");
    public static void  getEmployeeList(){ 
         try {
             PreparedStatement ps = conn.prepareStatement("select * from employees");
             ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                 System.out.println(""+rs.getString(1)+" "+rs.getString(2));
             }
        } catch (Exception e) {
            //e.printStackTrace();
             Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void updateEmployee() throws SQLException{ 
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name='Bangladesh' where employee_id=100");
            int i = ps.executeUpdate();
            System.out.println(i+" Data Updatede");
        } catch (Exception e) {
        }
    }
    public static void deleteEmployee() throws SQLException{ 
        try {
            PreparedStatement ps = conn.prepareStatement("delete from employees where employee_id = 206");
            int i = ps.executeUpdate();
            System.out.println(i+" Data Deleted");
        } catch (Exception e) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null,e);
        }
    }
    public static void createTable() throws SQLException{ 
        try {
            PreparedStatement ps = conn.prepareStatement("create table emp(id, name)values(1212,Milton)");
            int i = ps.executeUpdate();
            System.out.println(i+" Table Created");
        } catch (Exception e) {
            Logger.getLogger(TestService.class.getName()).log(Level.SEVERE, null,e);
        }
    }
}
