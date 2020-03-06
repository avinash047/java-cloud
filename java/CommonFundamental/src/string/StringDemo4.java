package string;

public class StringDemo4 {
	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Capgemini"); 
		for (int i = 0; i < 100; i++) {
			str1 = str1.append(" pune");
			
		}
		
		System.gc();
		System.out.println(str1.substring(0,14));

	}

}
