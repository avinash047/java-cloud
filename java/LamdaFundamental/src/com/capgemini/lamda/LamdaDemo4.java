package com.capgemini.lamda;
interface Displable{
	/* public void display(); */
	/* public void display(String msg); */
	public String display(String msg);
}
public class LamdaDemo4 {
	public static void main(String[] args) {
		
		/*
		 * Displable disp = ()->System.out.println("hello from lamda"); disp.display();
		 */
		 
		
		/*
		 * Displable disp = (String msg)->System.out.println(msg+" from lamda");
		 * disp.display("hello");
		 */
		/*
		 * Displable disp = ( msg) -> "Hello"+msg; String result =
		 * disp.display(" from lamda"); System.out.println(result);
		 */
		Displable disp = (msg) ->{
									System.out.println(msg);
									return "Hello"+msg;
								};
		String result = disp.display(" from lamda");
		System.out.println(result);
	}

}
