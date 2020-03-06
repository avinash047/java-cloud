package exception4;

public class AgeException extends Exception{
	private int age;
	public AgeException(){
		
	}
	public AgeException(int age){
		this.age = age;
	}
	@Override
	public String toString(){
		return "Invalid Age "+age;
	}

}
