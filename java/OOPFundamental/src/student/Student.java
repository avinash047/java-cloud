package student;

import oop5.Book;

public class Student {
	private int studentId;
	private String name;
	private long contactNo;
	private String course;
	private double fees;
	
	Student(int studentId, String name, long contactNo, String course, double fees){
		this.studentId = studentId;
		this.name= name;
		this.contactNo = contactNo;
		this.course = course;
		this.fees = fees;
	}
	public double totalFees(){
		return fees;
	}
	public void show(){
		System.out.println("Student Id: "+ studentId);
		System.out.println("Student name: "+ name);
		System.out.println("Contact number: "+contactNo);
		System.out.println("Course: "+course);
		System.out.println("Fees: "+fees);
		
		System.out.println(".....................................");
	}
	
	

}
