package dao;

import domin.Employee;
import java.util.List;

public interface CommonDao {

    List<?> getList();

    void insert(Employee obj);
}
