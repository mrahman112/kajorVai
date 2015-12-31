package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooFinance {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://finance.yahoo.com");
		driver.findElement(By.xpath("//*[@id='txtQuotes']")).sendKeys("ODP");
		driver.findElement(By.xpath("//*[@id='btnQuotes']")).click();
		
		
		String currentprice=driver.findElement(By.xpath("//span[@id='yfs_l84_odp']")).getText();
		String openingprice=driver.findElement(By.xpath("//*[@id='table1']/tbody/tr[2]/td")).getText();
		
		Thread.sleep(2000L);

        double current=Double.parseDouble(currentprice);
        System.out.println("current price of ODP is "+current);
        
        double open=Double.parseDouble(openingprice);
        System.out.println("Opening price for ODP was "+open);
		
		if((current*.01)>open)
		{
			//you can write code to report error by using ErroUtil.java
			System.out.println("there is an error");
		}
		else
		{
			System.out.println("price incresing or decreasing is in normal range");
		}
		

	}

}
