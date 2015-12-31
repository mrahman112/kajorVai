package com.nowriztech.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nowriztech.util.keywords;

public class LoginTest {
	
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
		keywords k=keywords.getInstance();
		k.openBrowser("testSiteUrl");
		k.input("userid", userid);
		k.input("password", password);
		
		
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="mizan";
		data[0][1]="mizan123";
		data[0][2]="mozilla";
		
		data[1][0]="mizan1";
		data[1][1]="mizan123";
		data[1][2]="chrome";
		
		return data;
		
		
	}

}
