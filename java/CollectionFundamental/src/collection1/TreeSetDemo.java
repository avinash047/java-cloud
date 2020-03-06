package collection1;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//TreeSet<Object> set = new TreeSet<Object>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1000);
		set.add(new Integer(350));
		set.add(50000);
		set.add(10);
		set.add(50000);
		//set.add(100.00); ...execute set.add((int) 100.00);
		
		System.out.println(set);
	}
}
