package com.capgemini.threading;

class Thread6 implements Runnable{
	//private int counter = 0;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("The name of current thread in run(): "+name);
		 int counter = 0;
		for(int i=1; i<=5; i++) {
			
			counter++;
			System.out.println(name +": "+counter);
			
			  try {
				  Thread.sleep(50);
			  } 
			  catch(InterruptedException e) {
				  System.out.println(e.getMessage()); 
			  }
			  
		}
		System.out.println("State of main: "+ThreadDemo6.main.getState());
	}
}
public class ThreadDemo6 {

	public static Thread main = null;
	
	public static void main(String[] args) {
		main = Thread.currentThread();
		
		System.out.println("The name of current thread in main(): "+Thread.currentThread().getName());
		System.out.println("Before creating child thread");
		
		Thread6 task  = new Thread6(); //task
			
		Thread t1 = new Thread(task); //Worker
		Thread t2 = new Thread(task); //Worker
		t1.setName("First");
		t2.setName("Second");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("After creating  child thread");
		//System.out.println("State of main: "+main.getState());
	}

}
