package lab2.exercise1;

import java.util.Scanner;

public class Person {
	 
	/*
	Person Details:
	-------------------
	First Name: Divya
	Last Name: bharathi
	Gender: F
	age: 20
	Weight: 85.55
	*/

   public static void main(String args[]){
	   
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter First Name: ");
	   String firstName =s.next();
	   System.out.println("Enter Last Name: ");
	   String lastName =s.next();
	   System.out.println("Enter Gender: ");
	   String gender =s.next();
	   System.out.println("Enter age: ");
	   int age = s.nextInt();
	   System.out.println("Enter weight: ");
	   double weight= s.nextDouble();
	   
	   System.out.println("Person Details:");
	   System.out.println("-------------------");
	   System.out.println("First Name: "+firstName);
	   System.out.println("Last Name: "+lastName);
	   System.out.println("Gender: "+gender);
	   System.out.println("age: "+age);
	   System.out.println("Weight: "+weight);
	   
   }
}
