package oop7;

public class AccountApp {

	public static void main(String[] args) {
		// Account acc = new Account(); //we can not create a object of abstract class.
		Account acc = new Saving(12345, "Avi", 98566, 25);
		acc.displayAccountInfo();

	}

}
