package com.yahoo.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.yahoo.base.TestBase;
import com.yahoo.util.Keywords;
import com.yahoo.xls.Xls_Reader;

public class RoughWork {
	static WebDriver driver=null;
	static Xls_Reader xls=null;
	static Properties OR=null;
	

	public static void main(String[] args) throws IOException {
		
		TestBase.testBaseStart();
		TestBase.openBrowser("testSiteUrl");
		TestBase.input("userid", "mdsapon");
		TestBase.input("password", "Jarjees1");
		TestBase.click("login_button");



	}
	
	public  static void input(String xpathkey, String text)
	{
		
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).sendKeys(text);
		
	}

}
