package oop7;

public class Account extends Object {
	
	private long accNumber;
	private String accHolderName;
	private double balance;
	
	public Account(){
		this(0,"",0.0);
	}
	
	public Account(long accNumber, String accHolderName, double balance) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void displayAccountInfo(){
		
		System.out.println("Account Nmuber: "+accNumber);
		System.out.println("Account Holder Name: "+accHolderName);
		System.out.println("Account Balance: "+balance);
	}
}
