package lab4.exercise1;

public class Account {

	private static long accountNumber = 14000001;
	private double accountBalance;
	private Person person;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public void depositMoney(double money) 
	{
		System.out.println("\nDepositing " + money  + " into account of" + person);
		accountBalance += money;
	}
	
	public void withdrawMoney(double money) 
	{
		if(accountBalance >= 500 && accountBalance-money >= 500) 
		{
			System.out.println("\nWithdrawn " + money + " from the acoount of " + person);
			accountBalance -= money;
		}
		else 
		{
			System.out.println("\nBalance in the account is/would be less than 500Rs");
		}
	}
	public Account(Person person,double accountBalance) {
		this.accountBalance = accountBalance;
		this.person = person;
		System.out.println("Account created for the user:" + person);
		accountNumber++;
	}
	public Account() {}
	
	
	
}