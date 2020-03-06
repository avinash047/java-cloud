package lab4.exercise1;

public class AccountApp {

	public static void main(String[] args) {

		Person person1 = new Person("Smith",22f);
		Account account1 = new Account(person1,2000);
		
		Person person2 = new Person("Kathy", 44f);
		Account account2 = new Account(person2,2000);
		
		account1.depositMoney(2000);
		account2.withdrawMoney(2000);
		
		System.out.println("\nAccount balance of " + person1 + " is Rs. " + account1.getAccountBalance());
		System.out.println("\nAccount balance of " + person2 + " is Rs. " + account2.getAccountBalance());
		
	}
}