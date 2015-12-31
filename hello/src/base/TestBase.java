package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import util.Xls_Reader;

public class TestBase {
	
	public static WebDriver driver=null;
	public static Properties or=null;
	public static Properties env=null;
	public static Xls_Reader xls=null;
	
	
	
	
	public static void initialize() throws IOException
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		env=new Properties();
	    FileInputStream fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\hello\\src\\config\\OR.properties");
	
	     env.load(fs);
	     
	     or=new Properties();
	     
	     String filename=env.getProperty("environment")+".properties";
	     fs=new FileInputStream("C:\\Users\\Humaira.Jarjees\\workspace\\hello\\src\\config\\"+filename);
	    
	     or.load(fs);
	     
	   xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\nowriz.xlsx");
	
	}
	
	
}
