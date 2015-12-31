package test;

import org.apache.log4j.Logger;

public class testinglog {

	public static void main(String[] args) {
		
		
		Logger applog=Logger.getLogger("devpinoyLogger");
		applog.debug("starting");
		applog.debug("ending");

	}

}
