package com.yahoo.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.yahoo.base.TestBase;



public class Keywords {
	
	public WebDriver driver=null;
	  static Keywords k;
	  
	  private Keywords()
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  
	  public static Keywords getInstances()
	  {
		  if(k==null)
			  k=new Keywords();
		  return k;
	  }

public void openbrowser(String url)
{
	driver.get(url);
}

public void input(String xpath,String text)
{
	driver.findElement(By.xpath(xpath)).sendKeys(text);
}

public void click(String xpath)
{
	driver.findElement(By.xpath(xpath)).click();
}



	

}
