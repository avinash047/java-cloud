package com.capgemini.logger;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Logger1 {
	private static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) throws IOException{
		
		FileAppender appender = new FileAppender(new SimpleLayout(),"logger.log");
		BasicConfigurator.configure(appender);
		int n1=10,n2=20;
		int result = add(n1,n2);
		System.out.println("Result: "+result);
		result=add(n1,n2,30,40);
		System.out.println("Result: "+result);
	}

	private static int add(int ...numbers) {
		
		logger.debug("no of arguments: "+numbers.length);
		
		int res=0;
		for(int num:numbers){
		res+=num;	
		}
		return res;
		
	}

}
