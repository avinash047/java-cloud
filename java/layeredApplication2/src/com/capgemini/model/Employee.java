package com.capgemini.model;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String employeeName;                                     
	private double employeeSalary;
	private int deptartmentId;
	private LocalDate employeeDoj;
	
	
	public int getDeptartmentId() {
		return deptartmentId;
	}
	public void setDeptartmentId(int deptartmentId) {
		this.deptartmentId = deptartmentId;
	}
	public LocalDate getEmployeeDoj() {
		return employeeDoj;
	}
	public void setEmployeeDoj(LocalDate employeeDoj) {
		this.employeeDoj = employeeDoj;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Employee(){
		
	}
	public Employee(int employeeId, String employeeName, double employeeSalary,int departmentId, LocalDate employeeDoj) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.deptartmentId = departmentId;
		this.employeeDoj = employeeDoj;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", deptartmentId=" + deptartmentId + ", employeeDoj=" + employeeDoj + "]";
	}
}
