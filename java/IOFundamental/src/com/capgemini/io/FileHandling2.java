package com.capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling2 {
	
	public static void main(String[] args) {
		
		File file = new File("C:/files/file1.txt");
		if(file.exists()){
			System.out.println(file.getName()+" is present");
			try {
				FileInputStream fis = new FileInputStream(file);
				int ch ;
				while((ch = fis.read()) != -1){
					System.out.print((char)ch);
				}
			}
			catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		else{
			System.out.println(file.getName()+" is not present");
		}
	}
}
