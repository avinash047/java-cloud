package vehical;

public class Vehical {
	private String regNo;
	private String brand;
	private double price;
	private int mileage;
	
	Vehical(String regNo, String brand, double price, int mileage){
		this.regNo = regNo;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
		
	}
	public double vehicalPrice(){
		return price;
	}
	public int vehicalMileage(){
		return mileage;
	}
	public void show(){
		System.out.println("Reg No: "+regNo);
		System.out.println("Brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("Mileage: "+mileage);
		System.out.println("..................................... ");
	}
}
