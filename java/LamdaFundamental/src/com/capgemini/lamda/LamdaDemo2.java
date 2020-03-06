package com.capgemini.lamda;

public class LamdaDemo2 {

	public static void main(String[] args) {
		Max ref = new Max() {
			
			@Override
			public int max(int n1, int n2) {
				
				return (n1>n2)?n1:n2;
			}
		};
		System.out.println("Max Number: "+ref.max(1234, 1987));
	}

}
