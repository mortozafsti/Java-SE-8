package swingpractise;

import dao.StudentDao;
import domain.Student;
import servise.StudentDaoImpl;

public class SwingPractise {

    public static void main(String[] args) {
        String sq = "create table students(id number(5) primary key,name varchar2(15))";
        
        StudentDao daoDomain = new StudentDaoImpl();
        
        //daoDomain.createTable(sq);
        Student studentt = new Student();
        studentt.setStudentId(33);
        studentt.setStudentname("Kamal");
        
        //daoDomain.insert(studentt);      
        //daoDomain.update(studentt);      
        daoDomain.delete(studentt);      
        
        for (Student s : daoDomain.getStudent()) {
            System.out.println(s.getStudentId()+" "+s.getStudentName());
        }
    }

}
