package com.mycompany.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class InsecureLogging 
{
	static final Logger logger = LogManager.getLogger(InsecureLogging.class);
	
	public static void main(String[] args) {
	
		InsecureLogging obj = new InsecureLogging();
		obj.runMe("This is a log");
		
	}
	
	private void runMe(String parameter){
		
		if (logger.isDebugEnabled()){
			logger.debug("This is debug : %s", parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : %s", parameter);
		}
		
		logger.warn("This is warn : %s", parameter);
		logger.error("This is error : %s", parameter);
		logger.fatal("This is fatal : %s", parameter);
		
	}
}
