EmployeeController.java 
package com.example.employeeapi.controller; 
import com.example.employeeapi.model.Employee; 
import com.example.employeeapi.service.EmployeeService; 
import java.util.List; 
import java.util.Optional; 
import org.springframework.web.bind.annotation.*; 
@RestController 
@RequestMapping("/employees") 
public class EmployeeController { 
private final EmployeeService service; 
public EmployeeController(EmployeeService service) { 
this.service = service; 
} 
@PostMapping 
public Employee addEmployee(@RequestBody Employee employee) { 
return service.addEmployee(employee); 
} 
@GetMapping 
public List<Employee> getAllEmployees() { 
return service.getAllEmployees(); 
} 
@GetMapping("/{id}") 
public Optional<Employee> getEmployeeById(@PathVariable Long id) { 
return service.getEmployeeById(id); 
} 
@PutMapping("/{id}") 
public Employee updateEmployee( 
@PathVariable Long id, 
@RequestBody Employee employee 
) { 
return service.updateEmployee(id, employee); 
} 
@DeleteMapping("/{id}") 
public String deleteEmployee(@PathVariable Long id) { 
service.deleteEmployee(id); 
return "Employee deleted successfully"; 
} 
} 
Employee.java 
package com.example.employeeapi.model; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
@Entity 
public class Employee { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long id; 
private String name; 
private String department; 
private double salary; 
public Employee() {} 
public Employee(Long id, String name, String department, double salary) { 
this.id = id; 
this.name = name; 
this.department = department; 
this.salary = salary; 
} 
public Long getId() { 
return id; 
} 
public void setId(Long id) { 
this.id = id; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { 
this.name = name; 
} 
public String getDepartment() { 
return department; 
} 
public void setDepartment(String department) { 
this.department = department; 
} 
public double getSalary() { 
return salary; 
} 
public void setSalary(double salary) { 
this.salary = salary; 
} 
} 
EmployeeRespository.java 
package com.example.employeeapi.repository; 
import com.example.employeeapi.model.Employee; 
import org.springframework.data.jpa.repository.JpaRepository; 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {} 
EmployeeService.java 
package com.example.employeeapi.service; 
import com.example.employeeapi.model.Employee; 
import com.example.employeeapi.repository.EmployeeRepository; 
import java.util.List; 
import java.util.Optional; 
import org.springframework.stereotype.Service; 
@Service 
public class EmployeeService { 
private final EmployeeRepository repository; 
public EmployeeService(EmployeeRepository repository) { 
this.repository = repository; 
} 
public Employee addEmployee(Employee employee) { 
return repository.save(employee); 
} 
public List<Employee> getAllEmployees() { 
return repository.findAll(); 
} 
public Optional<Employee> getEmployeeById(Long id) { 
return repository.findById(id); 
} 
public Employee updateEmployee(Long id, Employee employeeDetails) { 
Employee employee = repository.findById(id).orElseThrow(); 
employee.setName(employeeDetails.getName()); 
employee.setDepartment(employeeDetails.getDepartment()); 
employee.setSalary(employeeDetails.getSalary()); 
return repository.save(employee); 
} 
public void deleteEmployee(Long id) { 
repository.deleteById(id); 
} 
} 
EmployeeApiApplication.java 
package com.example.employeeapi; 
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
@SpringBootApplication 
public class EmployeeapiApplication { 
public static void main(String[] args) { 
SpringApplication.run(EmployeeapiApplication.class, args); 
} 
} 
EmployeeApplicationTest 
package com.example.employeeapi; 
import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
@SpringBootTest 
class EmployeeapiApplicationTests { 
@Test 
void contextLoads() { 
} 
}