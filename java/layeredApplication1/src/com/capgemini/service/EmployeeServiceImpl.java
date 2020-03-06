package com.capgemini.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;
public class EmployeeServiceImpl implements EmployeeService{

	private static Set<Employee> employeeDB = new HashSet<Employee>();
	@Override
	public boolean addEmployee(Employee employee) {
		boolean result = employeeDB.add(employee);
		return result;
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		Employee emp = null;
		Iterator<Employee>itr = employeeDB.iterator();
		while(itr.hasNext()){
			emp= itr.next();
			if(emp.getEmployeeId()==employeeId){
				return emp;
			}
		}
		return null;
	}
	

}
