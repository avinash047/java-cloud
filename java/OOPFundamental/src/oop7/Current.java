package oop7;

public class Current extends Account{
	
	private double overDraft;

	public Current(){
		
	}
	public Current(long accNumber, String accHolderName, double balance, double overDraft) {
		super(accNumber, accHolderName, balance);
		this.overDraft = overDraft;
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}
	@Override
	public void displayAccountInfo(){
		super.displayAccountInfo();
		System.out.println("OverDraft Limit: "+overDraft);
	
	}
	@Override
	public void finalize(){
		System.out.println("Current object is garbage collected");
	}
}
