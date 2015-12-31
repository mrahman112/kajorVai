package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver=new FirefoxDriver();
		
		driver.get("http://nowriztech.com");
		
		
		WebElement x=driver.findElement(By.xpath("//*[@id='mainmenuholder']/ul/li[3]/a/span"));
		Actions act=new Actions(driver);
		act.moveToElement(x).build().perform();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//*[@id='mainmenuholder']/ul/li[3]/ul/li[2]/a")).click();
		
	}

}
