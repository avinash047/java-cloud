package lab4.exercise22;

public class Saving extends Account {

	private final double minBalance = 500;
	
	public void withdraw(double withdrawBalance){
		double newbalance=balance-withdrawBalance;
		if(balance<500){
			System.out.println("Ensure Minimum balance of INR 500 in a bank account is available. ");
		}
		else{
			balance=newbalance;
		}
	}
	
}
