package com.hybrid.salesforce.testcases;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hybrid.util.KeyWords;
import com.hybrid.util.TestUtility;
import com.hybrid.util.Xls_Reader;

public class LoginTest {
	KeyWords k=KeyWords.getInstance();
	Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");
	
	
	
	@Test(dataProvider="getData")
	public void testingLogin(Hashtable<String,String> data)
	{
		if(!TestUtility.getRunmode("LoginTest", xls))
		{
			throw new SkipException("skipping test case");
		}
		
		
		if(data.get("Runmode").equals("n"))
		{
			throw new SkipException("test is skipping cause flag is set to no");
		}
		
		
		//k.keywordExecutor("LoginTest", xls, data);
		
		k.openBrowser(data.get("browser"));
		//validate title
		k.navigate("testSiteURL");
		Assert.assertTrue(k.validateTitle("homepagetitle"),"title did not match");
		
		k.click("loginpagelink");
		k.input("username",data.get("username"));
		k.input("password",data.get("password"));
		k.click("loginbutton");
		
		
		//why 2 different browser why not same browser
		
		
		/*driver.manage().window().maximize();
		driver.get("http://salesforce.com");
		driver.findElement(By.xpath("//*[@id='button-login']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	*/
	
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		return TestUtility.getData("LoginTest", xls);
	}

}
