package oop7;

public class Saving extends Account {
	private double roi;

	public Saving(){
		
	}
	public Saving(long accNumber, String accHolderName, double balance, double roi) {
		super(accNumber, accHolderName, balance);
		this.roi = roi;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}
	@Override
	public void displayAccountInfo(){
		super.displayAccountInfo();
		System.out.println("Rate of Interest: "+roi);
		System.out.println(".................................");
	}
	@Override
	public void finalize(){
		System.out.println("Saving object is garbage collected");
	}
	
}
