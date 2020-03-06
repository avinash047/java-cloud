package oop7;

public class AccountApp2 {

	public static void main(String[] args) {
		Account acc;
		
		acc = new Saving();
		//System.gc();
		acc.displayAccountInfo();
		
		acc = new Current();
		
		acc = new Current();
		System.gc();
		acc.displayAccountInfo();

	}

}
