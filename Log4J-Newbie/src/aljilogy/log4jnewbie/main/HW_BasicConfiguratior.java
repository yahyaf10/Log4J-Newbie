/**
 * 
 */
package aljilogy.log4jnewbie.main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/*
 * @author Mohamed ALJI
 *
 */
public class HW_BasicConfiguratior {

	// create an instance of Logger 
	private static Logger logger = LogManager.getLogger(HW_BasicConfiguratior.class);
	 
	 
	public static void main(String[] args) {
			
		// Quickly configure package
	    BasicConfigurator.configure();

		// app running		
		logger.info("my text to be logged as a INFO. ");
		logger.debug("my text to be logged as a DEBUG");
		logger.warn("my text to be logged as a WARN");
		logger.error("my text to be logged as a ERROR");
		logger.fatal("my text to be logged as a FATAL"); 



	}

}
