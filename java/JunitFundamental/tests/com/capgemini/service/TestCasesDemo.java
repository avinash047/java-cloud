package com.capgemini.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCasesDemo {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	@Test
	public void testCase1() {
		System.out.println("Test Case1");
	}
	@Test
	public void testCase2() {
		System.out.println("Test Case2");
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass 
	public static void afterClass(){
		System.out.println("After Class");
	}
}
