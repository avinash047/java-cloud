package collection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeApp {

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
		
		System.out.println("Before sorting: ");
		for(Employee emp:list){
			System.out.println(emp);
		}
		//Collections.sort(list); we can sort arraylist
		Collections.sort(list,new EmployeeIdSorter());//using comparator interface using we can sort the list
		
		System.out.println("After sorting by employee id: ");
		for(Employee emp:list){
			System.out.println(emp);
		}
	/*	//Collections.sort(list,new EmployeeSalarySorter()); //it use for create another class 
		//it is another way to sort list using comparator anonymous interface
    */		
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getEmployeeSalary()== o2.getEmployeeSalary())
					return 0;
				else if (o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
					return 1;
				}
				else
					return -1;
			}
			
		} );
		
		System.out.println("After sorting by employee salary: ");
		for(Employee emp:list){
			System.out.println(emp);
		}
	}

}
