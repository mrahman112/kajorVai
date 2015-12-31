package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import TestUtil.TestUtil;



public class TestBase {
	
	public static WebDriver driver=null;
	public static Properties config=null;
	public static Properties OR=null;
	
	 
	
	
	@BeforeSuite
	public void initialize() throws IOException
	{
		config=new Properties();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\config.properties");
		config.load(fp);
		
		OR=new Properties();
		 fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\OR.properties");
		OR.load(fp);
		
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	public static WebElement getObject(String xpathkey)
	{
	
		try{
		return driver.findElement(By.xpath(OR.getProperty(xpathkey)));
		}catch(Throwable t){
			//report error
			return null;
		}
	}

}
