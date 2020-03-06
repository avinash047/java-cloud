package lab7.exercise1;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;



public class Product {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("Baleno")  ;
		set.add("BMW");
		set.add("Audi");    
        set.add("Mercedes");  
        
        Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
        /*for(String str:set){
        	System.out.println(str);
        }*/
	}

}
