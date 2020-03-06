package com.capgemini.threading;

class Thread4 implements Runnable{
	private int counter = 0;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("The name of current thread in run(): "+name);
	
		for(int i=0; i<=5; i++) {
			counter++;
			System.out.println(name +": "+counter);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class ThreadDemo4 {

	public static void main(String[] args) {
		System.out.println("The name of current thread in main(): "+Thread.currentThread().getName());
		System.out.println("Before creating child thread");
		
		Thread4 task1  = new Thread4(); //task
		Thread4 task2  = new Thread4(); //task
		
		Thread t1 = new Thread(task1); //Worker
		Thread t2 = new Thread(task2); //Worker
		
		t1.start();
		t2.start();
		
		System.out.println("After creating  child thread");

	}

}
