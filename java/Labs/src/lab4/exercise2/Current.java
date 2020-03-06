package lab4.exercise2;

public class Current extends Account {
	
	private static double overdraft = -5000;

	public Current(String accNumber, String accHolderName, double accBalance) {
		super(accNumber, accHolderName, accBalance);
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	public Current() {}
	
	@Override
	public void showAccountInfo() 
	{
		System.out.println("\tCurrent Account:\n");
		super.showAccountInfo();
		System.out.println("Overdraft: " + overdraft);
	}
	
	@Override
	public boolean withdrawMoney(double money)
	{
		accBalance -= money;
		
		if(accBalance > overdraft) 
		{
			return true;
		}
	
	return false;
	}
	
}
