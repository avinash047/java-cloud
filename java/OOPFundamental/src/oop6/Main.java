package oop6;

class A{
	public A(int a){
		System.out.println("A()");
	}
}

class B extends A{
	public B(){
		super(5);
		System.out.println("B()");
	}
}

public class Main {

	public static void main(String[] args) {
		B b = new B();
		

	}

}
