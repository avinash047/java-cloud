package test;

public class SumofFourDigit {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int num1=num;
		int rem,sum=0;
		while(num1!=0){
			rem=num1%10;
			sum+=rem;
			num1/=10;
		}
		System.out.println("Sum of Four Digit Number "+num+"="+sum);
	}

}
