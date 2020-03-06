package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandling7 {

	public static void main(String[] args) {
		Employee emp = readObject();
		System.out.println(emp);

	}
	private static Employee readObject(){
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/files/file5.txt"));)
		{
			Employee emp = (Employee)ois.readObject();
			return emp;
		} 
		catch (IOException  | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
