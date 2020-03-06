package lab4.exercise2;

public class Saving extends Account{

	private static final double minBalance = 500;

	public Saving(String accNumber, String accHolderName, double accBalance) {
		super(accNumber, accHolderName, accBalance);
	}
	public Saving() {
	}
	
	@Override
	public void showAccountInfo() 
	{
		System.out.println("\tSaving Account:\n");
		super.showAccountInfo();
	}
	
	@Override
	public boolean withdrawMoney(double money) 
	{
		if(accBalance >= minBalance && accBalance-money >= minBalance) 
		{
			System.out.println("Withdrawn " + money );
			accBalance -= money;
			return true;
		}
		else 
		{
			System.out.println("Balance in the account is/would be less than 500Rs");
		}
		return false;
	}
}
