package com.totalpractice.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.totalpractice.util.Xls_Reader;





public class TestBase {
	
public static WebDriver driver=null;
public static Xls_Reader xl=null;
public static Logger applog=null;
	
	
	public static void startBrowser()
	{
		applog=Logger.getLogger("devpinoyLogger");
		applog.debug("loading browser");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		applog.debug("browser loaded successfully");
	}
	public static void initialize()
	{
		applog=Logger.getLogger("devpinoyLogger");
		applog.debug("loading xl file");
		xl=new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\totalpractice\\config\\ebaylogin.xlsx");
		applog.debug("loaded xl file successfully");
	
	}
	
	

}
