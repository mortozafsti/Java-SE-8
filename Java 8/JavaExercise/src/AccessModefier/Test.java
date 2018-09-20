
package AccessModefier;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        Student s1 = new Student(1, "Mortoza");
        Student s2 = new Student(2, "Mahabub");
        Student s3 = new Student(3, "Harun");
        Student s4 = new Student(4, "Shakil");
        Student s5 = new Student(5, "Mostafiz Chowdhury");
        Student s6 = new Student(6, "Lohit Sharma");
        Student s7 = new Student(7, "Shakil Mahabub");
        Student s8 = new Student(8, "Jamil Khan");
        Student s9 = new Student(9, "Kamal Uddin");
        Student s10 = new Student(10, "Hasan Ulah");
        
       // Student[] ss = {"Mortoza","Mahabub","Harun","Shakil","Mostafiz","Lohit","Shakil","Jamil","Kamal","Hasan","Uddin"};
        List<Student> stu = new ArrayList();
        
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);
        stu.add(s6);
        stu.add(s7);
        stu.add(s8);
        stu.add(s9);
        stu.add(s10);
        stu.add(new Student(11, "Milton"));
        
        for (Student student : stu) {
            System.out.println(student);
        }
    }    
}
