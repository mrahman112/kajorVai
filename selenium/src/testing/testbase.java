package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class testbase {
	public static WebDriver driver=null;
	public static Xls_Reader xl=null;
	
	
	@BeforeTest
	public void initiatebrowser()
	{
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id='default-p_30345789-bd']/ul/li[1]/a/span")).click();
		
	}
}
