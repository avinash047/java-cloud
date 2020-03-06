package string;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = "Capgemini"; //object1
		//String str2 = "capgemini"; //object2
		
		str1 = str1.substring(3); //object3
		System.gc();
		System.out.println(str1);
	}

}
