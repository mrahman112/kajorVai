package rough;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

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
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
        System.out.println(alllinks.size());
        System.out.println(alllinks.get(2).getText());

	}

}
