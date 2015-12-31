package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	public void test()
	{
		
		WebDriver d=new FirefoxDriver();
	
	d.get("http://www.gmail.com");
	try{
	WebElement element= d.findElement(By.xpath("//div/span"));
	element.sendKeys("dwarika");
	}
	catch(Exception e)
	{
	e.printStackTrace();
	new SendMail("mizansapon@gmail.com","mdsapon@yahoo.com",e);
	}

	//Read more: http://www.abodeqa.com/2013/06/19/email-your-failing-selenium-webdriver-scripts-stack-trace-to-your-email-id/#ixzz3RD3F9w5u
	}
}
