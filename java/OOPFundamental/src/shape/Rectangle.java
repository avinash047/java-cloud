package shape;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle(){
		
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void displayArea(){
		
		System.out.println("Area of Rectangle: "+(length*breadth));
	}
	/*..............................
	  public Rectangle(){
		
	}
	  	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
 		public double displayArea(){
			return length*breadth;
	}*/

}
