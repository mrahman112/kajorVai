package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentBrowser {

	public static void main(String[] args) {
		
		String browser="chrome";
		
		WebDriver driver=null;
		
		if(browser.equals("mozilla"))
		{
			driver=new FirefoxDriver();
			
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("http://nowriztech.com");
		
	

	}

}
