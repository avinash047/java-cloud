package oop9;

public class AccountApp {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccNumber(1111);
		acc.setAccBalance(8000);
		
		Customer cust = new Customer();
		
		cust.setFirstName("Virat");
		cust.setLastName("Kohli");
		
		acc.setCustomer(cust); //relationship
		
		System.out.println(acc.toString());
		System.out.println(acc.getCustomer());
		
	}

}
