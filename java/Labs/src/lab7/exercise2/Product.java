package lab7.exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class Product {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("Baleno")  ;
		list.add("BMW");
		list.add("Audi");    
		list.add("Mercedes");  
        
        Collections.sort(list);
        for(String str:list){
        	System.out.println(str);
        }
	}

}
