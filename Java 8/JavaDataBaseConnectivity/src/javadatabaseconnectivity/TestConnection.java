
package javadatabaseconnectivity;

import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) throws SQLException {
        TestService.getEmployeeList();
       // TestService.updateEmployee();
        TestService.deleteEmployee();
    }
}
