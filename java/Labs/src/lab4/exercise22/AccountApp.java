package lab4.exercise22;

public class AccountApp {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setAccNumber(12345);
		acc.setBalance(2000.0);
		Account acc1 = new Account();
		acc1.setAccNumber(98765);
		acc1.setBalance(3000.0);
		
		Person p = new Person();
		p.setName("Smith");
		p.setAge(22);
		Person p1 = new Person();
		p1.setName("kathy");
		p1.setAge(29);
		
		acc.setAccHolder(p);
		acc1.setAccHolder(p1);
		System.out.println(".................Details....................");
		System.out.println(acc.toString());
		System.out.println(acc.getAccHolder());
		
		System.out.println("..........................................................");
		System.out.println(acc1.toString());
		System.out.println(acc1.getAccHolder());
		System.out.println(".................Updated balance....................");
		acc.deposite(2000);
		acc1.deposite(1000);
		acc.withDraw(2000);
		System.out.println(acc);
		System.out.println(acc.getAccHolder());
		acc1.withdraw(2000);
		System.out.println(acc1);
		System.out.println(acc1.getAccHolder());
		
	}

}
