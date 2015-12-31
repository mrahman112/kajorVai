package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class nowriztech {
	
	public static WebDriver driver=null;
	
	
	@BeforeTest
	
	public void initialize()
	
	{
       driver=new FirefoxDriver();
      
	}
	
	@Test
	public void testing()
	{
      driver.get("http://nowriztech.com");
      
      driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://nowriztech.com");
		
		try
		{
			driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName']")).sendKeys("mizan101");
		}catch(Exception e){
		
		//driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("nts123");
		String actual=driver.getTitle();
		String expected="ariztech";
      
     


	}

	
	
	
	
	//Assert.assertEquals(actual, expected);

}
