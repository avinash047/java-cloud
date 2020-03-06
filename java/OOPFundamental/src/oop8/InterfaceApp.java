package oop8;

interface I1{
	int x=100;  //constant...compiler like that
				//public static final int x=100;
	void meth1();
	public static void meth2(){
		System.out.println("Static meth2 of interface");
	}
	public default void meth3(){
		System.out.println("Default meth3 of interface");
	}
}

class C1 implements I1{
	public void meth1(){
		
		System.out.println("x: "+I1.x);
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		I1 ref;
		ref = new C1();
		ref.meth1();
		
		I1.meth2();
		ref.meth3();
	}

}
