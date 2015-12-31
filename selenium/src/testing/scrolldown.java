package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Thread.sleep(5000L);
		driver.executeScript("scroll(0,20000)");
		
	}

}
