package com.capgemini.lamda;

import java.util.ArrayList;
import java.util.List;

public class BasicStream {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Capgemini");
		list.add("Infosys");
		list.add("wipro");
		list.add("Congnizent");
		list.add("JP");
		list.add("TCS");
		
		list.stream().forEach((com)->System.out.println(com));
		System.out.println("-----------------------------------------");
		list.stream()
			.filter((com)->com.length()>3)
			.forEach(com->System.out.println(com));
		System.out.println("-----------------------------------------");
		list.stream()
			.filter(com->com.length()>3)
			.map(com->com.length())
			.forEach(len->System.out.println(len));
		System.out.println("-----------------------------------------");
	}
}
