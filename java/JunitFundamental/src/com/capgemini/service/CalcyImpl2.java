package com.capgemini.service;

public class CalcyImpl2 {

	public int sub(int num1, int num2) {
		int diff;
		if(num1<0 ||num2<0) {
			throw new IllegalArgumentException("Number cant be Negative.");
		}
		diff=num1-num2;
		
		return diff;
	}
}
