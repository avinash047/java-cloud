package lab2.exercise3;

public class PersonMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("Avinash", "Londhe", 'M');
		System.out.println("Person Details:");
		System.out.println("-------------------");
		System.out.println("First Name: "+p1.getFirstName());
		System.out.println("Last Name: "+p1.getLastName());
		System.out.println("Gender: "+p1.getGender());
	}

}
