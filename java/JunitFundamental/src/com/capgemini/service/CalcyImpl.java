package com.capgemini.service;

public class CalcyImpl implements Calcy {

	@Override
	public long add(int ...params) {
		
		int sum = 0;
		for(int num:params) {
			if(num<0) {
				throw new IllegalArgumentException("Number cant be Negative.");
			}
			sum+=num;
		}
		return sum;
	}
}
