package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMoving {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://nowriztech.com");
	
		
		
		//mouse moving to an element
		  WebElement item = driver.findElement(By.xpath("//*[@id='mainmenuholder']/ul/li[3]/a/span"));
          
          Actions builder = new Actions(driver);
          
          // Purchases
          
          builder.moveToElement(item).build().perform();
          Thread.sleep(1000L);
          
		
	
		
		System.out.println(driver.findElement(By.xpath("//*[@id='mainmenuholder']/ul/li[3]/ul/li[1]/a")).isDisplayed());
		
		WebElement sub=driver.findElement(By.xpath("//*[@id='mainmenuholder']/ul/li[3]/ul/li[2]/a"));
		sub.click();
		
		String text=driver.findElement(By.xpath("//*[@id='ibtHomeBoxWelcome']")).getText();
		System.out.println(text);
	}

}
