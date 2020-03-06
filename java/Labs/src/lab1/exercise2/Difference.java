package lab1.exercise2;

public class Difference {

	public static int calculateDifference(int n){
		int squareSum=0,sumSquare=0,difference=0;
		for(int i=1;i<=n;i++){
			squareSum=squareSum+i*i;
			sumSquare=sumSquare+i;
		}
		
		difference=squareSum-(sumSquare*sumSquare);
		return difference;
	}
	public static void main(String[] args) {
		int number=4;
		int difference=calculateDifference(number);
		System.out.println("Difference of Number: "+difference);
		

	}

}
