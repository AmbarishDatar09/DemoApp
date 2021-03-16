package com.example.demo.service;
import java.util.List;

import javax.transaction.Transactional;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.*;


@Service("service")//EmployeeServiceImpl service=new EmployeeServiceImpl()
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	public void addEmployee(Employee Employee) {
		dao.addEmployee(Employee);
	}

	public void updateEmployee(Employee Employee) {
		dao.updateEmployee(Employee);
	}

	public void removeEmployee(int EmployeeId) {
		dao.removeEmployee(EmployeeId);
	}

	public Employee getEmployeeById(int EmployeeId) {
		return dao.getEmployeeById(EmployeeId);
	}

	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

}
