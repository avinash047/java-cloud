package oop6;

public class Saving extends Account{
	private double roi;
	public Saving(String name, long number, double balance, double roi){
		accountHolderName = name;
		accountNumber = number;
		accountBalance = balance;
		this.roi = roi;
	}
	
	public void showDetails(){
		super.showDetails();
		System.out.println("Rate of Interest "+roi );
	}
}
