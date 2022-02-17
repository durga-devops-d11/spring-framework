package com.java;

public class Employee {
	private long employeeId;
	private String name;
	private String email;

	public Employee() {
		super();
	}

	public Employee(long employeeId, String name, String email) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + "]";
	}

}
