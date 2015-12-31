package com.totalpractice.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.totalpractice.base.TestBase;
import com.totalpractice.util.Xls_Reader;




public class TestSuiteBase extends TestBase{
	
	
	@BeforeTest
	public void initiatebrowser()
	{
		
		startBrowser();
		
		
		initialize();
	}

}
