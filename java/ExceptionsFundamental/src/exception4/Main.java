package exception4;

public class Main {
	
	public static boolean validateAge(int age)throws AgeException{
		if (age >=21 && age<=60){
			return true;
		}
		else{
			throw new AgeException(age);
			// another method for throw exception (creating object of AgeException)
			//AgeException ae = new AgeException();
			//throw ae;
		}
	}
	public static void main(String[] args) {
		int age = 22;
		try{
			boolean result = Main.validateAge(age);
			if(result){
				System.out.println("Age of value is correct.");
			}
		}
		catch(AgeException e){
			System.out.println(e);
		}
		
	}

}
