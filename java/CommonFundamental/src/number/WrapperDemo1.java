package number;

public class WrapperDemo1 {

	public static void main(String[] args) {
		int x = 1000;
		short s = (short)x;//upcasting
		
		float f = 100.0f;
		double d = 10000.0;
		x = (int)f;
		f=(float) d;
		d=x; //upcasting

		
	}

}
