package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import rough.pch;
import util.Xls_Reader;
import util.testutil;
import base.TestBase;

public class login extends TestBasesuite{
	
	@Test(dataProvider="testdata")
	public void dologin(String userid,String password) throws Exception
	{
		
		
		driver.get(or.getProperty("testSiteURL"));
		testutil.input("first_name", userid);
		testutil.input("last_name", password);
	    testutil.click("submit_button");
	    
	    String actualvalue=driver.findElement(By.xpath(or.getProperty("page_title"))).getText();
		String expectedvalue="Welcome Mizanur Rahman";
		Assert.assertEquals(actualvalue, expectedvalue);
		Thread.sleep(5000L);
	}
	
	
	@AfterTest
	public void close()
	{
		testutil.signout("signout");
		driver.close();
		driver.quit();
	}
	
	
	@DataProvider
	public Object[][] testdata()
	{
		
		return testutil.getdata(xls,"LoginTest");
	}
	
	

}
