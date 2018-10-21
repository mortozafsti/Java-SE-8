package swingcurd;

import dao.StudentDao;
import domain.Student;
import service.StudentDaoImple;

public class SwingCurd {

    public static void main(String[] args) {

        String sq = "Create table student(id number(5) primary key,name varchar2(55))";

        StudentDao obj = new StudentDaoImple();
        // obj.createTable(sq);
        Student student = new Student();
        student.setId(333);
        student.setName("Ajad");
        // obj.indert(student); 
        // obj.update(student);
        Student st = obj.getById(1);
        System.out.println(st.getId() + " " + st.getName());
        obj.delete(student);
        for (Student s : obj.getStudent()) {
            System.out.println(s.getId() + " " + s.getName());
        }

    }

}
