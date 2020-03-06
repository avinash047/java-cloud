package lab4.exercise22;

public class Account {
	private long accNumber;
	protected double balance;
	private Person accHolder;
	
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposite(double depositeBalance){
		balance=balance+depositeBalance;
	}
	boolean withDraw(double b){
		return true;
	}
	public void withdraw(double withdrawBalance){
		double newbalance=balance-withdrawBalance;
		if(balance<500){
			System.out.println("Ensure Minimum balance of INR 500 in a bank account is available. ");
		}
		else{
			balance=newbalance;
		}
	}
	@Override
	public String toString() {
		return "Account [ Number: " + accNumber + ",  balance:" + balance+"]";
	}
	
	

}
