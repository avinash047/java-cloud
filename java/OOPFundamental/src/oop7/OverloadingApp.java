package oop7;

public class OverloadingApp {

	public void display(){
		System.out.println("Display method without parameter");
	}
	public void display(int x){
		System.out.println("Display method with int parameter");
	}
	public void display(float y){
		System.out.println("Display method with float parameter");
	}
	/* 
	 int display(int x){
		System.out.println("Display method with int parameter");
		return 1;
	}
	*/
	public static void main(String[] args) {
		OverloadingApp m = new OverloadingApp();
		m.display();
		m.display(5);
		m.display(1.2f);
	}

}
