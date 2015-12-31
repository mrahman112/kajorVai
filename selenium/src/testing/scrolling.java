package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(dr);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/#q=hello");
		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("hello");
		Thread.sleep(2000L);
		
		String starts="//*[@id='nav']/tbody/tr/td[";
		String ends="]/a";
		
		
		
		driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td[4]/a")).click();
		
	}

}
