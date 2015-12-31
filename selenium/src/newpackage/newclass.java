package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import testing.protected_class;

public class newclass {
	
	public static String k;
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		 driver=new FirefoxDriver();
		 driver.manage().window().maximize();


		 driver.get("http://tdbank.com");
		 driver.findElement(By.xpath("//*[@id='old_footer']/p[1]/a[7]")).click();
		
		
		
		

	}
	
	
	public void hello()
	{
		
	}

}
