package com.capgemini.lamda;

public class LamdaDemo3 {

	/**
	 * Lamda expression
	 * InterfaceName Reference=()->{body} ~~ex. Max lamda = (n1,n2) -> (n1>n2)?n1:n2;
	 * Calling method
	 * refernce.methodName();~~ex.lamda.max(1234, 1987)
	 */
	public static void main(String[] args) {
		Max lamda = (n1,n2) -> (n1>n2)?n1:n2;//
		System.out.println("Max Number: "+lamda.max(1234, 1987));
	}

}
