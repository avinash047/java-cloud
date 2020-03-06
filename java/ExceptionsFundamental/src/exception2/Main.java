package exception2;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start of App");
		try{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		double div = num1 / num2;
		System.out.println("Result: "+div);
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Program expect two int argumentt. Please pass them.");
		}
		catch(ArithmeticException e){
			System.out.println("Can't divide by zero.");
		}
		catch(NumberFormatException e){
			System.out.println("Can't convert string value into number");
		}
		finally{
			System.out.println("Closing of Resources.");
		}
		
		System.out.println("Start of App");
	}

}
