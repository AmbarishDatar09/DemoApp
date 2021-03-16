package com.example.demo.repository;
import com.example.demo.entity.*;

import java.util.List;



public interface EmployeeDao {
	void addEmployee(Employee Employee);

	void updateEmployee(Employee Employee);

	void removeEmployee(int EmployeeId);

	Employee getEmployeeById(int EmployeeId);

	List<Employee> getAllEmployees();
}
