package string;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String str1 = "Capgemini"; 
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str1 = str1 + " pune";
			
		}
		
		//System.gc();
		System.out.println(str1.substring(0,14));
		long end = System.currentTimeMillis();
		System.out.println("Time taken to execute: "+(end-start)+"ms");
		

	}

}
