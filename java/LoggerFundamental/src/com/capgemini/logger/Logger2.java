package com.capgemini.logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Logger2 {
	private static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		//logger.setLevel(Level.INFO);
		logger.setLevel(Level.ERROR);
		logger.debug("Debug Message");
		logger.info("Info Message");
		logger.warn("Warn Message");
		logger.error("Error Message");
		logger.fatal("Fatal Message");
		
		

	}

}
