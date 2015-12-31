package com.nowriztech.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keywords {
	
	WebDriver driver=null;
	
	Properties or=null;
	static keywords k;
	public String name;
	
	private keywords() throws IOException
	{
		
		
		or=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\SingletonDesignPattern\\src\\com\\nowriztech\\config\\or.properties");
		
		or.load(fs);
	
	}
	
	public static keywords getInstance() throws IOException
	{
		
		if(k==null)
			k=new keywords();
		return k;
	}
	
	
	
	
	public void openBrowser(String url)
	{
		driver.get(or.getProperty(url));
		
		
		
	}
	
	public void input(String xpathkey,String text)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(text);
	}
	
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}
	
	

}
