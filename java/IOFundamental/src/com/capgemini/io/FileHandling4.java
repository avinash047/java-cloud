package com.capgemini.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling4 {
	
	public static void main(String[] args) {
		
		File file = new File("C:/files/file1.txt");
		if(file.exists()){
			System.out.println(file.getName()+" is present");
			FileReader fr = null;
			BufferedReader br = null;
			try {
				 fr = new FileReader(file);// read the character
				 br = new BufferedReader(fr);// read the line by line
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}
			catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				//e.printStackTrace();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
			finally{
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) { }
				}
				if(fr != null) {
					try {
						fr.close();
					} catch (IOException e) { }
				}
				
				
			}
		}
		else{
			System.out.println(file.getName()+" is not present");
		}
	}
}
