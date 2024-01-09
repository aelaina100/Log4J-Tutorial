package Beta;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Alpha.Demo;

public class Demo1 {
	// To begin using logs in this class, define Log4j manager here.
  private static Logger log= LogManager.getLogger(Demo.class.getName()); // Passed argument is to get the entire path of the class you're currently in.

	public static void main(String[] args) {
		
		log.debug(" Demo1: I am debugging !");   
		log.info(" Demo1: Object is present");
		
			// Use it to define error messages.
		log.error(" Demo1: Object is NOT  present");
		log.fatal(" Demo1: This is fatal");

	}

}
