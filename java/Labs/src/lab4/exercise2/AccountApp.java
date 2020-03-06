package lab4.exercise2;

public class AccountApp {

	public static void main(String[] args) {
		
		Account acc;
		
		acc = new Saving("74185239","Robert",10000);
		acc.withdrawMoney(15000);
		System.out.println();
		acc.withdrawMoney(4000);
		System.out.println();
		acc= new Current("65498732", "Downey", 6000);
		if(acc.withdrawMoney(1500)) 
		{
			System.out.println("Account not overdrawn");
		}
		else 
		{
			System.out.println("Overdraft limit reached");
		}
		System.out.println();
		
		if(acc.withdrawMoney(12000)) 
		{
			System.out.println("Account not overdrawn");
		}
		else 
		{
			System.out.println("Overdraft limit reached");
		}
		
	}

}
