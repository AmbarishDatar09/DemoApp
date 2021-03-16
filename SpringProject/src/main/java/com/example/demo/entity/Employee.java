package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@GeneratedValue
	@Column(length = 10)
	private int EmployeeId;
	@Column(length = 10)
	private String EmployeeName;
	@Column(length = 20)
	private String Address;

	public Employee(int EmployeeId, String EmployeeName, String Address) {
		super();
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
		this.Address = Address;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Address=" + Address
				+ "]";
	}

	public Employee( String EmployeeName, String Address) {
		super();
		this.EmployeeName = EmployeeName;
		this.Address = Address;
	}

}
