package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class YahooSignOut {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://ebay.com");
		
		/*driver.findElement(By.xpath("//*[@id='username']")).sendKeys("muradpur2002");
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("humaira1");
		driver.findElement(By.xpath("//*[@id='.save']")).click();
		Thread.sleep(5000L);
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id='yucs-menu_link_profile']"))).build().perform();
		
		Thread.sleep(20000L);
		driver.findElement(By.xpath("html/body/div[4]/div[4]/div[2]/div[1]/div/ul/li/div[2]/div/ul/li[4]/a")).click();

*/
new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@id='gh-cat']"))).build().perform();
        
        driver.findElement(By.xpath("//*[@id='gh-cat']")).click();
        Thread.sleep(10000L);
        driver.findElement(By.xpath("//*[@id='gh-cat']")).sendKeys("Books");
	
	}

}
