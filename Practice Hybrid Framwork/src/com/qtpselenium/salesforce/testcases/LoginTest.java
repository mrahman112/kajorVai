package com.qtpselenium.salesforce.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qtpselenium.util.Keywords;

public class LoginTest {
	WebDriver driver=null;
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password,String browser,String flag)
	{
		if(flag.equals("n"))
		{
			throw new SkipException("test case is skippin cause runmode set to no");
		}
		Keywords k=new Keywords();
		k.openBrowser(browser);
		k.navigate("testsiteurl");
		Assert.assertTrue(k.validate("titlemsg"), "title did not match");
		k.click("loginlink");
		k.input("userid", username);
		k.input("passwd", password);
		k.click("loginbutton");
		
			
		
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object data[][] =new Object[3][4];
		
		data[0][0]="u1";
		data[0][1]="p1";
		data[0][2]="mozilla";
		data[0][3]="y";
		
		data[1][0]="u2";
		data[1][1]="u1";
		data[1][2]="chrome";
		data[1][3]="n";
		
		data[2][0]="u3";
		data[2][1]="u1";
		data[2][2]="mozilla";
		data[2][3]="y";
		return data;
	}

}
