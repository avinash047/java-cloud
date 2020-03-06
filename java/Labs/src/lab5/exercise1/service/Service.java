
package lab5.exercise1.service;

import lab5.exercise1.bean.Employee;

/**
 *Salary 			Designation 				Insurance scheme 
 *>5000and< 20000 	System Associate 				Scheme C 
 *>=20000and<40000 	Programmer 						Scheme B 
 *>=40000 			Manager 						Scheme A 
 *<5000 			 Clerk						     No Scheme 
 *
 */

public class Service implements EmployeeService {
	
	public void  insuranceService(Employee emp)
	{ 
		double salary =emp.getSalary();
		String designation = emp.getDesignation();
		if((salary > 5000 && emp.getSalary() < 20000)&& designation.equals("System Associate")){
			emp.setInsuranceScheme("Scheme C ");
		}
		else if((salary >= 20000 && emp.getSalary() < 40000)&& designation.equals("Programmer") ){
			emp.setInsuranceScheme("Scheme B ");
		}
		else if((salary >= 40000)&& designation.equals("Manager") ){
			emp.setInsuranceScheme("Scheme A ");
		}
		else{
			emp.setInsuranceScheme("No Scheme ");
		}
	}
}
