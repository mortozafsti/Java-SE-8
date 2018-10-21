
package dao;

import domain.Student;
import java.util.List;

public interface StudentDao {
    
    void createTable(String sql);
    void insert(Student s);
    void update(Student s);
    void delete(Student s);
    Student getByid(int id);
    List<Student> getStudent();
}
