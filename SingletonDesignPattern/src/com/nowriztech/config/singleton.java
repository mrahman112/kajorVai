package com.nowriztech.config;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nowriztech.util.keywords;

public class singleton {
	WebDriver driver=null;


	@Test(dataProvider="getData")
	public void doLogin(String userid,String password,String browsertype) throws IOException
	{
		if(browsertype.equals("mozilla"))
		{
		driver=new FirefoxDriver();
		}
		else if(browsertype.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("http://yahoomail.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
		
		
		
	}
	
	@DataProvider(parallel=true)
	public Object[][] getData()
	{
		Object[][] data=new Object[3][3];
		data[0][0]="mizan";
		data[0][1]="mizan123";
		data[0][2]="mozilla";
		
		data[1][0]="mizan1";
		data[1][1]="mizan123";
		data[1][2]="chrome";
		
		data[2][0]="mizan2";
		data[2][1]="mizan123";
		data[2][2]="mozilla";
		
		return data;
		
		
	}

	}


