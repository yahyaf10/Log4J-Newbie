/**
 * 
 */
package aljilogy.log4jnewbie.main2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/*
 * @author Mohamed ALJI
 *
 */
public class HelloWorld2 {

	private static Logger logger = LogManager.getLogger(HelloWorld2.class);
	 
	 
	public static void main(String[] args) {
			
		
	    BasicConfigurator.configure();

		//SimpleLayout layout = new SimpleLayout();
		
		//ConsoleAppender stdout = new ConsoleAppender(layout);
		//logger.addAppender(stdout);
		
		// app running
		
		logger.info("my text to be logged as a INFO. ");
		logger.debug("my text to be logged as a DEBUG");
		logger.warn("my text to be logged as a WARN");



	}

}