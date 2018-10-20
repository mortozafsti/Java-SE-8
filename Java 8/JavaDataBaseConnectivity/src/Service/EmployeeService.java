
package Service;

import dao.CommonDao;
import domin.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javadatabaseconnectivity.DbConnection;

public class EmployeeService implements CommonDao{
    Connection conn = DbConnection.getConnection("xe", "hr", "hr");
    @Override
    public List<?> getList() {
        List<Employee> list = new ArrayList<>();
        
        Employee em;
        try {
            PreparedStatement ps =conn.prepareStatement("select * from employees");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                em = new Employee();
                em.setEmployeeID(Integer.parseInt(rs.getString(1)));
                em.setFirstName(rs.getString(2));
                list.add(em);
            }           
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name='Kalaaaam' where employee_id=100");
            int list = ps.executeUpdate();
            System.out.println(list+" Data Updatede");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
