package com.totalpractice.rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.totalpractice.util.Xls_Reader;

public class roughwork {
	


	
	
	
	public static void main(String[] arg)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://nowriztech.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys("mizan101");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("nts123");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		//verify valid login
		//applog.debug("verifying valid login");
		
		String actualtile=driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_lblError']")).getText();
		String expected="You have 14  message(s).";
		System.out.println(actualtile);
		if(expected==actualtile)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
	}
	
	
	
		
	
		

}
