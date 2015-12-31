package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigPractice {
	static WebDriver driver=null;
	static Properties OR=null;
	
	
	
	@BeforeTest
	
	public static void initialize() throws IOException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		OR=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\config\\OR.properties");
	
		OR.load(fs);
	
	
	}
	
	
	
	@Test
	
	public void doLogin()
	{
		driver.get(OR.getProperty("testSiteURL"));
		input("first_name", "mizan");
		input("last_name", "nts123");
		
	}
	
	public static void click(String xpathkey)
	{
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).click();
	}
	
	
	public static void input(String xpathkey,String text)
	{
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).sendKeys(text);
	}
	
	
	

}
