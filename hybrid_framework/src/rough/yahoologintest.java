package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class yahoologintest extends testbase{
	
	@BeforeTest
	public void openTest(){
		intitialize();
	}
	
	
	@Test
	public void yahootest()
	{
		
		Actions action = new Actions(driver);
		WebElement mailElement = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/ul/li[3]/div/div/a/span"));
		action.moveToElement(mailElement).build().perform();
		mailElement.click();
		                  
		
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userid);
		//driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(passwd);
	
	}

}
