package collection1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(100);
		set.add(2500.50);
		set.add("Capgemini Pune");
		set.add(100);//do not add duplicate value in collection-Set
		set.add(new Integer(1000));
		set.add(new Integer(100));
		System.out.println(set);

	}

}
