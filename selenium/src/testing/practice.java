package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
	static WebDriver driver=null;
	static Properties OR=null;
	static Properties env=null;
	static FileInputStream fs=null;
	static Logger app_log=null;

	public static void main(String[] args) throws IOException {
		
		
		
		 env=new Properties();
		 fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\config\\OR.properties");
		env.load(fs);
		OR=new Properties();
		String filename=env.getProperty("environment")+".properties";
		fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\config\\"+filename);
		OR.load(fs);
		
		app_log=Logger.getLogger("devpinoyLogger");
		app_log.debug("loading Object repository");
		
		
		openBrowser(OR.getProperty("browsertype"));
		driver.get(OR.getProperty("testSiteURL"));
		app_log.debug("loading test site url");
		//*[@id='firstname']
		inputtext(OR.getProperty("first_name"),"abu");
		inputtext(OR.getProperty("last_name"),"khan");
		
		app_log.debug("test execution completed");
		
		/*
		
		inputtext("//*[@id='email']","mdsapon@yahoo.com");
		inputtext("//*[@id='PASSWORD']","hello123");
		inputtext("//*[@id='rpass']","hello123");
		
		*/
		
	}
	
	
	public static void inputtext(String xpath, String text)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	  
	}
	
	
	public static void openBrowser(String browsertype)
	{
		if(browsertype.equals("mozilla"))
		{
			driver=new FirefoxDriver();
		}
		else if(browsertype.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromdriver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
			
	}

}
