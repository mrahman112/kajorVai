package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class yahootest extends testbase{
	
	
	
	@Test(dataProvider="getData")
	
	public void testing(String userid,String passwd) throws InterruptedException
	{
		
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=http%3A%2F%2Fwww.ebay.com%2F");
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(passwd);
		driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
		Thread.sleep(2000L);
	}
	
	
	
	}

