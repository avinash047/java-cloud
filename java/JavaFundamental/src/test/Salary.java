package test;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		//creating object of scanner
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter basic salary: ");
		
		double basicSalary=scanner.nextDouble();
		//double hra,da,grossSalary=0.0;
		double hra=0.0,da=0.0,grossSalary=0.0;
		if(basicSalary <= 15000){
			hra=0.20 * basicSalary;
			da=0.70 * basicSalary;
			//grossSalary=basicSalary+hra+da;
		}else if(basicSalary <= 30000){
			hra=0.35 * basicSalary;
			da=0.80 * basicSalary;
			//grossSalary=basicSalary+hra+da;
		}
		else if(basicSalary > 30000) {
			hra=0.20 * basicSalary;
			da=0.80 * basicSalary;
			//grossSalary=basicSalary+hra+da;
		}
		grossSalary=basicSalary+hra+da;
		System.out.println("Gross salary:"+grossSalary);
		
		
	}


}
