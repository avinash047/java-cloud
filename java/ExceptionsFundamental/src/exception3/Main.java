package exception3;

import java.io.IOException;

class X{
	//unchecked exception  
	public static double calculate(int num1, int num2){
		if(num2 != 0)
			return num1 / num2;
		else
			throw new ArithmeticException("can't divide by zero.");
	}
	//checked exception 
	public static double calculate2(int num1, int num2)throws IOException{
		if(num2 != 0)
			return num1 / num2;
		else
			throw new IOException("can't divide by zero.");
	}
}

public class Main {

	public static void main(String[] args) {
		
		int num1 = 100;//Integer.parseInt(args[0]);
		int num2 = 0;//Integer.parseInt(args[1]);
		//double result = X.calculate(num1, num2);
		try{
		double result = X.calculate2(num1, num2);
		System.out.println("Result: "+result);
		}
		catch(IOException e){
			System.out.println("Please pass correct input to the program.  ");
		}
		
	}

}
