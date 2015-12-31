package com.gmail.util;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Keywords {
	
	public static void input(String xpath,String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
    }
	
	public static void click(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void validation(String xpath,String expected)
	{
		String actual=driver.findElement(By.xpath(xpath)).getText();
		Assert.assertEquals(actual, expected);
		
	}

}
