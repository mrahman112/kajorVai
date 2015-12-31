package com.loggintest.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintest {
	
	//add log4j jar into the project
	//add log4j.properties in the src
	//configure the destination target to save logs
	// initiate Logger class
	
	static WebDriver driver=null;
	

	public static void main(String[] args) {
	 Logger applog=Logger.getLogger("devpinoyLogger");
		openbrowser();
		applog.debug("browser opened ");
	    dologin("mizan101", "nts123");
	    
	    applog.debug("userid and password entered ");
	}
	
	public static void openbrowser()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://nowriztech.com");
		
		
	}
	
	public static void dologin(String userid,String password)
	{
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(password);
	}
	

}
