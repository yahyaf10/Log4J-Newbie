/**
 * 
 */
package aljilogy.log4jnewbie.main;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

/*
 * @author Mohamed ALJI
 *
 */
public class HelloWorld {

	private static Logger logger = LogManager.getLogger(HelloWorld.class);
	 
	 
	public static void main(String[] args) {
		
		logger.info("my text to be logged as a INFO. ");
		logger.debug("my text to be logged as a DEBUG");
		logger.warn("my text to be logged as a WARN");
		
		SimpleLayout layout = new SimpleLayout();
		ConsoleAppender stdout = new ConsoleAppender(layout);
		logger.addAppender(stdout);



	}

}
