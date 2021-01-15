package f5.barcode4j_bartik;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();
}
