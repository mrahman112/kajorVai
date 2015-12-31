package newlesson;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class firstjava {
	
	public WebDriver driver=null;
	
	@Test
	public void browser()
	{
		secondjava j=secondjava.getinstance();
		j.initialize();
		
		driver.get("http://yahoo.com");
		
       

		
	}
	
	

	

}
