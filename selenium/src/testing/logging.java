package testing;

import org.apache.log4j.Logger;





public class logging {

	public static void main(String[] args) {
		Logger applog=Logger.getLogger("devpinoyLogger");
		applog.debug("hello");

	}

}
