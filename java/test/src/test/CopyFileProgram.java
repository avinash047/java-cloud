package test;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class CopyFileProgram extends Thread {
	 CopyFileProgram(File f){
		 
	 }
	public void run() {
	int counter = 0 ;
		try {
			FileReader fr = new FileReader("C:/Avinash Traning/Module/Core java/Labs/src/lab13/source.txt");
			
			FileWriter fw = new FileWriter("C:/Avinash Traning/Module/Core java/Labs/src/lab13/target.txt", true);
			 int character;
			 
	            while ((character = fr.read()) != -1) {
	                //System.out.print((char) character);
	            	 fw.write((char)character);
	            	 counter++;
	            	 if(counter%10==0)
	            	 {
	            		 System.out.println("ten charaters copied");
	            		 try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            	 }
	            }
	            fr.close();
                fw.close(); 
                System.out.println(" file copied");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
