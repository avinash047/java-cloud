package oop6;

public class Account {
	protected String accountHolderName;
	protected long accountNumber;
	protected double accountBalance;
	
	public Account(){
		
	}
	public Account(String name, long number, double balance){
		accountHolderName = name;
		accountNumber = number;
		accountBalance = balance;	
	}
	public void showDetails(){
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Balance: "+accountBalance);
	}

}
