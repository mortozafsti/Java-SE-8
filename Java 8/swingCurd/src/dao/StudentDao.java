
package dao;

import domain.Student;
import java.util.List;

public interface StudentDao {
    
    //List<Student> getStudents();
    
    void createTable(String sql);
    void indert(Student s);
    void update(Student s);
    void delete(Student s);
    Student getById(int id);
    List<Student> getStudent();
}
