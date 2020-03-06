package lab4.exercise2;

public abstract class Account {

	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	protected String accNumber;
	protected String accHolderName;
	protected double accBalance;
	
	public Account(String accNumber, String accHolderName, double accBalance) {
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	public Account() {
		this("","",0.0);
	}
	
	public void showAccountInfo() 
	{
		System.out.println("Account Number: " + accNumber);
		System.out.println("Account Holder: " + accHolderName);
		System.out.println("Account Balance: " + accBalance);
		
	}
	
	public abstract boolean withdrawMoney(double money);
	
}
