package com.bridgeit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	/* public static void main(String[] args) {
		    Logger logger = LoggerFactory.getLogger(App.class);
		    logger.info("Hello World");
		    logger.warn("hassel");
		  }*/
/*---------------------------------------------------------------- */
	/*static Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

	for (int i = 0; i < 10; i++)

	if (i % 2 == 0)

	LOGGER.info("Hello {}", i);

	else

	LOGGER.debug("I am on index {}", i);
	
	}
	*/
/*----------------------------------------------------------------*/
	
	 final Logger logger = LoggerFactory.getLogger(App.class);
	
	    Integer t;
	    Integer oldT;
	
	   public void setTemperature(Integer temperature) {
	    
	    oldT = t;        
	     t = temperature;
	
	     logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);
	     if(temperature.intValue() > 50) {
	      logger.info("Temperature has risen above 50 degrees.");
	     }
	   }
	   public static void main(String[] args) {
		   App app =new App();
		   app.setTemperature(26);
		   app.setTemperature(60);	   
	 }
}