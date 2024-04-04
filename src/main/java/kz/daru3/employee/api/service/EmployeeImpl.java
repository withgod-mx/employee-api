package kz.daru3.employee.api.service;

import kz.daru3.employee.api.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeImpl implements IEmployeeService {

    private Map<Integer, Employee> employees;

    public EmployeeImpl() {
        employees = new HashMap<>();
    }

    @Override
    public Employee create(Employee employee) {
        employees.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public Employee findById(int id) {
        return this.employees.get(id);
    }

    @Override
    public List<Employee> employeeList() {
        List<Employee> emp = new ArrayList<>();

        for (Map.Entry<Integer, Employee> map: employees.entrySet()) {
            emp.add(map.getValue());
        }

        return emp;
    }

    @Override
    public boolean compareEmployee(Employee employee) {
        Employee e = this.employees.get(employee.getId());
        return (e.equals(employee));
    }
}
