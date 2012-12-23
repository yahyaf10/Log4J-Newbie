/**
 * 
 */
package aljilogy.log4jnewbie.main3;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/*
 * @author Mohamed ALJI
 *
 */
public class HW_FileAppender {

	private static Logger logger = LogManager.getLogger(HW_FileAppender.class);
	 
	 
	public static void main(String[] args) {
			
		
		PropertyConfigurator.configure("log4j_2.properties");
		
		logger.info("my text to be logged as a INFO. ");
		logger.debug("my text to be logged as a DEBUG");
		logger.warn("my text to be logged as a WARN");
		logger.error("my text to be logged as a ERROR");
		logger.fatal("my text to be logged as a FATAL"); 



	}

}
