package com.capgemini.threading;

public class ThreadDemo1 {

	
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		/**  
		 * Thread t1 = Thread.currentThread();
		 * String name = t1.getName();
		 */
		System.out.println("Thread Example: "+name);

	}

}
