package com.example.demo.service;
import com.example.demo.entity.Employee;
import java.util.List;



public interface EmployeeService {

	void addEmployee(Employee Employee);

	void updateEmployee(Employee Employee);

	void removeEmployee(int EmployeeId);

	Employee getEmployeeById(int EmployeeId);

	List<Employee> getAllEmployees();
}
