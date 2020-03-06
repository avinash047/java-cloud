package com.capgemini.lamda;

public class LamdaDemo1 implements Max{
	
	public static void main(String[] args) {
	
		Max ref = new LamdaDemo1();
		System.out.println("Max Number: "+ref.max(1234, 987));
	}
	@Override
	public int max(int n1, int n2) {
		return (n1>n2)?n1:n2;
	}
	
}
