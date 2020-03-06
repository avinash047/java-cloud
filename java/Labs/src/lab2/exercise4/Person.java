package lab2.exercise4;

import java.util.Scanner;
public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	private long phoneNumber;
	public Person(){
		
	}
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void showPhoneNumber(){
		
		System.out.println("Enter Phone Number: ");
		Scanner s = new Scanner(System.in);
		 phoneNumber = s.nextLong();
		
	}
	public void detailsPerson(){
		System.out.println("Person Details:");
		System.out.println("-------------------");
		System.out.println("First Name: "+getFirstName());
		System.out.println("Last Name: "+getLastName());
		System.out.println("Gender: "+getGender());
		System.out.println("Phone Number: "+phoneNumber);
	}


}
