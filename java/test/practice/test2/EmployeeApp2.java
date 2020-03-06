package test2;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeApp2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1001,"Avi",1500);
		Employee emp2 = new Employee(1003,"Sam",2500);
		Employee emp3 = new Employee(1002,"Raj",6500);
		Employee emp4 = new Employee(1002,"Raj",6500);
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		Collections.sort(list,(o1,o2) -> {
			if(o1.getEmployeeSalary()== o2.getEmployeeSalary())
				return -1;
			else if (o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
				return 1;
			}
			else
				return 0;
		});
		System.out.println("After sorting by employee salary: ");
		for(Employee emp:list){
			System.out.println(emp);
		}
	}

}
