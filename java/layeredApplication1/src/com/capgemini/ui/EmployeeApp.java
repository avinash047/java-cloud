package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.model.Employee;
import com.capgemini.service.EmployeeService;
import com.capgemini.service.EmployeeServiceImpl;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		EmployeeService service = new EmployeeServiceImpl();
		boolean flag = true;
		do{
		System.out.println("1. Add Employee");
		System.out.println("2. Find Employee");
		System.out.println("0. Exit Application");
		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1:
					System.out.println("Enter employee Id: ");
					int empId = scanner.nextInt();
					System.out.println("Enter employee Name: ");
					String empName = scanner.next();
					System.out.println("Enter employee salary: ");
					double empSal = scanner.nextDouble();
					
					Employee emp = new Employee(empId,empName,empSal);
					boolean result = service.addEmployee(emp);
					if(result){
						System.out.println("Employee added succesfully.");
					}
					break;
			case 2:
					System.out.println("Enter employee Id");
					empId = scanner.nextInt();
					Employee emp2 =service.findEmployeeById(empId);
					System.out.println(emp2);
					break;
			case 0:
					flag=false;
		}
		}while(flag);
		
	}

}
