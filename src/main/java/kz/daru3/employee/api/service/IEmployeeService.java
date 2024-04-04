package kz.daru3.employee.api.service;

import kz.daru3.employee.api.model.Employee;

import java.util.List;

public interface IEmployeeService {

    public Employee create(Employee employee);

    public Employee findById(int id);

    public List<Employee> employeeList();

    public boolean compareEmployee(Employee employee);
}
