package com.capgemini.io;


import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling5 {
	
	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		BufferedWriter bw =null ;
		String line;
		try {
			bw = new BufferedWriter(new FileWriter("C:/files/file4.txt"));
			System.out.println("Enter anything & to end app type exist: ");
			while(!(line=dis.readLine()).equalsIgnoreCase("exit")){
				bw.write(line+"\n");
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally{
			if(bw !=null){
				try {
					bw.close();
				} catch (IOException e){
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
