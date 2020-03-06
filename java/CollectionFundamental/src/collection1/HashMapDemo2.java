package collection1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Long> map = new HashMap<String, Long>();
		map.put("Avi", 9876543210L);
		map.put("Sachin", 9638527410L);
		map.put("Sachin", 7418529630L);
		map.put(null,0L);
		map.putIfAbsent("Avi", 9888888888L);
		
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			Long value = map.get(key);
			System.out.println("Key: "+key+",Value: "+value);
			
		}
	}

}
