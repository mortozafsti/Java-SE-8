
package dao;

import domain.Student;
import java.util.List;

public interface studentDao {
    
    void createTable(String sql);
    void insert(Student s);
    void update(Student s);
    void delete(Student s);
    Student getById(int id);
    List<Student> getStudent();
    
}
