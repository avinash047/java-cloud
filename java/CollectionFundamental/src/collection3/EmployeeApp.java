package collection3;

import java.util.TreeSet;

//import collection2.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		TreeSet<Employee> set = new TreeSet<Employee>();
		Employee emp1 = new Employee(1001,"Avi",8500);
		Employee emp2 = new Employee(1002,"Sam",7500);
		Employee emp3 = new Employee(1003,"Raj",6500);
		Employee emp4 = new Employee(1003,"Raj",6500);
		
		set.add(emp1);//adding element  at that time compare the values.
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		for(Employee emp: set){
			System.out.println(emp);
		}
	}

}
