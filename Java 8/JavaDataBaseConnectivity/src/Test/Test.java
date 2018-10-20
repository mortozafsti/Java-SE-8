
package Test;

import Service.EmployeeService;
import dao.CommonDao;
import domin.Employee;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        CommonDao daoCom = new EmployeeService();
        List<Employee> list =  (List<Employee>) daoCom.getList();
                
        daoCom.update();
        for (Employee e : list) {
            System.out.println(e.getEmployeeID()+" "+e.getFirstName());
        }
    }
}
