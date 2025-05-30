package com.di.property_injection_using_p_schema;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String EmployeeAddress;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		EmployeeAddress = employeeAddress;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeAddress() {
		return EmployeeAddress;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeAddress(String employeeAddress) {
		EmployeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", EmployeeAddress="
				+ EmployeeAddress + "]";
	}

}
