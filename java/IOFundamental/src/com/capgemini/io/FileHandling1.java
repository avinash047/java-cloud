package com.capgemini.io;

import java.io.File;

public class FileHandling1 {

public static void main(String[] args) {
		
		File file = new File("C:/files/file1.txt");
		if(file.exists()){
			System.out.println(file.getName()+" is present");
		}
		else{
			System.out.println(file.getName()+" is not present");
		}
	}

}
