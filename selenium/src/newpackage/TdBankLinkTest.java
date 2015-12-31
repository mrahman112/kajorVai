package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TdBankLinkTest {

	public static void main(String[] args) throws Exception {


		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://tdbank.com");
		
		Actions act=new Actions(driver);
		WebElement mousemove=driver.findElement(By.xpath("//*[@id='td-nav-level2']/ul/li[2]/span"));
		//act.moveToElement(mousemove).build().perform();
		
		String start_xpath="//*[@id='td-nav-level2']/ul/li[2]/ul/li/div/div/div[2]/div[2]/ul/li[";
		
		String ends_xpaht="]/a";
		
		for(int i=1;i<=9;i++)
		{
			act.moveToElement(mousemove).build().perform();
			Thread.sleep(3000L);
			driver.findElement(By.xpath(start_xpath+i+ends_xpaht)).click();
			Thread.sleep(3000L);
			driver.navigate().back();
			act.moveToElement(mousemove).build().perform();
		}

	}

}
