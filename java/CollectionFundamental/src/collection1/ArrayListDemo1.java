package collection1;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Capgemini");
		list.add("TCS");
		list.add("Wipro");
		list.add("Infy");
		list.add("Google");
		list.add("Capgemini");
		list.add(1,"Facebook");
		
		System.out.println(list);
		System.out.println("Size of list: "+list.size() );
	
		/**
		list.remove(1);
		
		System.out.println(list);
		System.out.println("Size of list: "+list.size() );
		 */
	}

}
