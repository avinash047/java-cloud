package com.capgemini.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalcyImpl2Test {

	@Test
	@Ignore
	public void testSub() {
		fail("Not yet implemented");
	}
	@Test
	public void testSubForPositiveCase1() {
		CalcyImpl2 target = new CalcyImpl2();
		int result=target.sub(2,5);
		assertEquals(-3, result);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSubShouldThrowIllegalArgumentException1() {
		CalcyImpl2 target = new CalcyImpl2();
		target.sub(-5,-2);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSubShouldThrowIllegalArgumentException2() {
		CalcyImpl2 target = new CalcyImpl2();
		target.sub(-5,2);
		
	}
	
	
	

}
