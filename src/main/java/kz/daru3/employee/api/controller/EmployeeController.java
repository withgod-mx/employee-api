package kz.daru3.employee.api.controller;

import kz.daru3.employee.api.model.Employee;
import kz.daru3.employee.api.service.EmployeeImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    // Object haskCode and equals
    // Когда возникает коллизии
    // Почему нужно переопределить методы haskCode and equals

    private final EmployeeImpl employeeService;

    public EmployeeController(EmployeeImpl employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(this.employeeService.create(employee));
    }

    @GetMapping("")
    public ResponseEntity<Employee> findEmployeeById(@RequestParam int id) {
        return ResponseEntity.ok(this.employeeService.findById(id));
    }

    @GetMapping("/all")
    public List<Employee> findAllEmployee() {
        return this.employeeService.employeeList();
    }


    @PostMapping("/compare")
    public boolean compareEmployee(@RequestBody Employee employee) {
        return this.employeeService.compareEmployee(employee);
    }


}
