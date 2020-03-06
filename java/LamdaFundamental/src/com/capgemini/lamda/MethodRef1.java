package com.capgemini.lamda;
@FunctionalInterface
interface Adder{
		public int add(int n1, int n2);
}

class AdderImpl{
	public static int addition1(int num1, int num2) {
		System.out.println("num1: "+num1+",num2: "+num2);
		return num1+num2;
	}
	public  int addition2(int num1, int num2) {
		System.out.println("non static method num1: "+num1+",num2: "+num2);
		return num1+num2;
	}
}
public class MethodRef1 {

	public static void main(String[] args) {
		Adder ref1=(n1,n2) -> n1 + n2;
		System.out.println(ref1.add(100, 200));
		
		Adder ref2 = AdderImpl :: addition1;
		System.out.println(ref2.add(1234, 756));
		
		Adder ref3 = new AdderImpl() :: addition2;
		System.out.println(ref3.add(1234, 756));
	}

}
