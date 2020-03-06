package number;

public class WrapperDemo3 {

	public static void main(String[] args) {
		int x = 1000;
		Integer obj = new Integer(x); //Boxing
		
		int y = obj.intValue();	//Boxing
		
		Integer obj2 = x; //Auto-Boxing
		
		int z = obj2; //Auto-UnBoxing
		
		System.out.println("x: "+x+" obj: "+obj+" y: "+y+" obl2: "+obj2+" z: "+z);
	}

}
