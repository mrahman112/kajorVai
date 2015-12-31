package com.qtpselenium.util;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Keywords {
	
	WebDriver driver=null;
	Properties or=null;
	
	public Keywords()
	{
		try{
			
			or=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\salesforce\\config\\OR.properties");
			or.load(fs);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void openBrowser(String browser)
	{
		if(browser.equals("mozilla"))
		{
			driver=new FirefoxDriver();
		}
			
		else if (browser.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	public void navigate(String url)
	{
		driver.get(or.getProperty(url));
	}
	
	public  void input(String xpath,String value)
	{
		
		
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(value);
		
    }
	
	public  void click(String xpath)
	{
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
	}
	
	public  void validation(String xpath,String expected)
	{
		String actual=driver.findElement(By.xpath(or.getProperty(xpath))).getText();
		Assert.assertEquals(actual, expected);
		
	}
	
	public boolean validate(String expected)
	{
		String expectedtitle=or.getProperty(expected);
		String actual=driver.getTitle();
		
		if(expectedtitle.equals(actual))
			return true;
		else
			return false;
		
		
	}

}
