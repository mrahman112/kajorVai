package com.totalpractice.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;












import com.totalpractice.base.TestBase;
import com.totalpractice.util.TestUtil;
import com.totalpractice.util.Xls_Reader;

public class LoginTest extends TestSuiteBase{
	
	
	
	
	@Test(dataProvider="getTestData")
	public void doLogin(String userid,String password)
	{
		
		driver.get("http://nowriztech.com");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		
		String actualtitle=driver.findElement(By.id("ContentPlaceHolder1_lblname")).getText();
		String expectedtitle="Welcome Mizanur Rahman";
		Assert.assertEquals(expectedtitle, actualtitle);
		
	}
	
	
	@DataProvider
	public Object[][] getTestData(){
		
		return TestUtil.getdata(xl,"Sheet1");
	}
		
		
		
		
		
		

}
