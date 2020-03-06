

package lab5.exercise1.pl;
import java.util.Scanner;

import lab5.exercise1.bean.Employee;
import lab5.exercise1.service.Service;
/**
 * private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
 *
 */
public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Service s1 = new Service();
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter employee details:");
		System.out.println("Enter Id:");
		int id = s.nextInt();
		System.out.println("Enter Name d:");
		String name = s.next();
		System.out.println("Enter Salary:");
		double salary =s.nextDouble();
		System.out.println("Enter Designation:");
		//String designation = s.next();
		String designation= s.nextLine();
		designation+=s.nextLine();
		
		
		//System.out.println("Enter Insurance Scheme:");
		//String insuranceScheme = s.next();
		emp1.setId(id);
		emp1.setName(name);
		emp1.setSalary(salary);
		emp1.setDesignation(designation);
		
		s1.insuranceService(emp1);
		System.out.println(emp1);
		//s1.insuranceService();
		
		

	}

}
