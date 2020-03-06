package string;

public class StringDemo1 {

	public static void main(String[] args) {
		String str1 = "Capgemini";
		String str2 = new String("Capgemini");
		String str3 = "capgemini";
		String str4 = new String("Capgemini");
		if(str1==str3){
			System.out.println("str1==str3");
		}
		else{
			System.out.println("str1!=str3");
		}
		if(str2==str4){
			System.out.println("str2==str4");
		}
		else{
			System.out.println("str2!=str4");
		}
		
		if(str2.equals(str4)){
			System.out.println("str2==str4");
		}
		else{
			System.out.println("str2!=str4");
		}
		if(str2.equalsIgnoreCase(str4)){
			System.out.println("str2==str4");
		}
		else{
			System.out.println("str2!=str4");
		}
	}

}
