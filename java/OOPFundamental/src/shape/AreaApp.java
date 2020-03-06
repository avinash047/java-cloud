package shape;
import java.util.Scanner;
public class AreaApp {
	static int x,n;
	public static void main(String[] args) {
		Shape s1 = new Rectangle(10.0,25.0);
		Shape s2 = new Circle(15.0);
		Scanner s = new Scanner(System.in);
		System.out.println("1.Area of Rectangle:");
		System.out.println("2.Area of Circle:");
		System.out.println("3.Exist:");
		do{
		System.out.println("Enter input:");
			x = s.nextInt();
		switch(x){
		case 1: s1.displayArea();
				break;
		case 2: s2.displayArea();
				break;
		default:System.out.println("Exist:");
				break;
		}
		System.out.println("......If you want to continue press 1:..........");
		n=s.nextInt();
		}while(n==1);
	}

}
