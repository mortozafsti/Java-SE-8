
package swingappex;

import dao.studentDao;
import domain.Student;
import service.StudentDaoImpl;

public class SwingAppEx {

    public static void main(String[] args) {
      
        String sq = "create table info(id number(5) primary key,name varchar2(15))";
        studentDao obj = new StudentDaoImpl();
        //obj.createTable(sq);
        Student student = new Student();
        student.setId(3);
        student.setName("Shakil");
       // obj.insert(student);
        //obj.update(student);
        //obj.delete(student);
        Student st = obj.getById(2);
         System.out.println(st.getId()+" "+st.getName());
        for (Student s : obj.getStudent()) {
            System.out.println(s.getId()+" "+s.getName());
        }
        
        
    }
    
}
