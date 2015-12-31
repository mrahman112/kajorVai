package rough;

import org.apache.log4j.Logger;

public class YahooTest  {
	
public static Logger app_log=null;
	
	
public void initialize()
{
	
	app_log=Logger.getLogger("devpinoyLogger");
	app_log.debug("hello");
	
}
	
}
