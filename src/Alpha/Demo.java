package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	// To begin using logs in this class, define Log4j manager here.
	private static Logger log= LogManager.getLogger(Demo.class.getName()); // Passed argument is to get the entire path of the class you're currently in.

	public static void main(String[] args) {
		
		// each log.something is unique and has one specific purpose.
			//Just for debugging as in normal info (I went to this page, I clicked on this, etc. Some normal info you want to pass to console)
		log.debug(" Debugging I am debugging !");   
		log.info(" Infoing Object is present");
		
			// Use it to define error messages.
		log.error(" Erroring  Object is NOT  present");
		log.fatal(" Fataling  This is fatal");
		
//Now if NO "Log4j.xml" file in included, 
		//then only some of the log types would be displayed as we're directed to some default configuration when log4j.xml file not found.
		  // Nevertheless, an included Log4j.xml file overrides the default configuration.

	}

}
