package com.hybrid.util;

import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.ORB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyWords {
	
	WebDriver driver=null;
	Properties OR=null;
	Properties ENV=null;
	WebDriver bakup_mozilla;
	WebDriver bakup_chrome;
	
	static KeyWords k;
	
	private KeyWords()
	{
		try{
			OR=new Properties();
			FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\salesforce\\config\\OR.properties");
		    OR.load(fs);
		    
		    //load enviroment
		    
		    ENV=new Properties();
		   String filename=OR.getProperty("environment")+".properties";
		   fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\salesforce\\config\\"+filename);
		   ENV.load(fs);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static KeyWords getInstance()
	{
		if(k==null)
		
			k=new KeyWords();
			
		
		return k;
	}
	
	
	
	public static void keywordExecutor(String testName,Xls_Reader xls,Hashtable<String,String> table)
	{
		
		int rows=xls.getRowCount("Test Steps");
		for(int rnum=2;rnum<=rows;rnum++)
		{
			String TCID=xls.getCellData(testName, "TCID", rnum);
			String keyword=xls.getCellData(testName, "keyword", rnum);
			String Object=xls.getCellData(testName, "Object", rnum);
			String Data=xls.getCellData(testName, "Data", rnum);
			
		}
	}
	
	public void openBrowser(String browsername)
	{
		if(browsername.equals("Mozilla")){
			driver=new FirefoxDriver();
			bakup_mozilla=driver;
			}else if(browsername.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
				driver=new ChromeDriver();
				bakup_chrome=driver;
			}
		
		
		
		
		if(browsername.equals("Mozilla")&& bakup_mozilla!=null)
		{
			driver=bakup_mozilla;
			return;
		}
		else if(browsername.equals("chrome")&& bakup_chrome!=null)
		{
			driver=bakup_chrome;
			return;
		} 
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void click(String xpathkey)
	{
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).click();
	}
	
	public void navigate(String URLkey)
	{
		driver.get(ENV.getProperty(URLkey));
	}
	
	public void input(String xpathkey,String text)
	{
		driver.findElement(By.xpath(OR.getProperty(xpathkey))).sendKeys(text);;
	}
	
	public boolean validateTitle(String expectedTitleKey)
	{
		String expectedTitle=OR.getProperty(expectedTitleKey);
		String actualTitle=driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			return true;
			
		}
		else
			return false;
	}

}
