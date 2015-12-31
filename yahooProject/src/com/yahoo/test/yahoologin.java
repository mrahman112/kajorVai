package com.yahoo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yahoo.utility.YahooUtil;
import com.yahoo.xls.Xls_Reader;

public class yahoologin {
	
	WebDriver driver=null;
	Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\workspace\\yahooProject\\src\\com\\yahoo\\xls\\yahoo.xls");
	
	@BeforeTest
	public void beforeTest()
	{
		driver=new FirefoxDriver();
	}
	
	
	@Test(dataProvider="gotData")
	public void actualTest(String userid)
	{
		driver.get("http://yahoomail.com");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='.save']")).click();
		String expected="Please enter your password";
		String actual=driver.findElement(By.xpath("//*[@id='fsLogin']/div/strong")).getText();
		Assert.assertEquals(actual, expected);
	}
	
	@DataProvider
	public Object [][] gotData()
	{
		return YahooUtil.getData(xls, "yahoologin");
	}

}
