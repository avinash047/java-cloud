package shape;

public class Circle extends Shape {
	private double radius;

	public Circle(){
		
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void displayArea(){
		
		System.out.println("Area of Circle: "+(3.14*radius*radius));
	}
	/*...........................................
	 * 	public Circle(){
		
	}
	 * 	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	 * public double displayArea(){
		
		return 3.14*radius*radius;
	}
	 * */
	
	
}
