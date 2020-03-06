package collection1;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("Avi", 9876543210L);
		map.put("Sachin", 9638527410L);
		map.put("Sachin", 7418529630L);
		map.put(null,0L);
		map.putIfAbsent("Avi", 9888888888L);
		long value = map.get("Avi");
		System.out.println("Avi's number: "+value);
		
		System.out.println(map);
	}

}
