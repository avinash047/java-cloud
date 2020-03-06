package vehical;

public class VehicalData {

	public static void main(String[] args) {
		Vehical v = new Vehical("TK125", "TVS", 80000, 10);
		Vehical v1 = new Vehical("HK125", "HERO", 90000, 20); 
		v.show();
		v1.show();
		double p=v.vehicalPrice();
		double p1=v1.vehicalPrice();
		int m1 = v.vehicalMileage();
		int m2 = v1.vehicalMileage();
		System.out.println("Vehical-1 Price: "+p);
		System.out.println("Vehical-2 Price: "+p1);
		System.out.println("!!!!!!!!!!!Lowest Price and Best Mileage!!!!!!!!!!!! ");
		if(p<p1){
			System.out.println("Lowest Price: "+p);
		}
		else{
			System.out.println("Lowest Price: "+p1);
		}
		if(m1<m2){
			System.out.println("Best Mileage: "+m2);
		}
		else{
			System.out.println("Best Mileage: "+m1);
		}
	}

}
