package com.capgemini.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileHandling6 {
	public static void main(String args[]) {
		Employee emp = new Employee(100,"Avi", 5000);
		writeObject(emp);
		
	}
	private static void writeObject(Employee emp){
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/files/file5.txt"));)
		{
			oos.writeObject(emp);
			System.out.println("Object written to file");
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
