package test;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=Integer.parseInt(args[0]);
		int flag=0;
	
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				flag=1;break;
			}
		}
		/*if(num==1){
			System.out.println(" 1 is a composite Number");
		}
		else{}*/
			if(flag==0&&num>1){
				System.out.println(num + "Prime Number");
			}
			else{
				System.out.println(num + "Not Prime Number");
			}
	}

}
