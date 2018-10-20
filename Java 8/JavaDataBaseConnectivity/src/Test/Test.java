
package Test;

import Service.EmployeeService;
import dao.CommonDao;
import domin.Employee;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        CommonDao daoCom = new EmployeeService();
        
        Employee employee = new Employee();
        employee.setEmployeeID(207);
        employee.setFirstName("Milton");
        
        daoCom.insert(employee);
        
        
//        List<Employee> list =  (List<Employee>) daoCom.getList();
//                       
//        for (Employee e : list) {
//            System.out.println(e.getEmployeeID()+" "+e.getFirstName());
//        }
    }
}
