package rough;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Xls_Reader;
import util.utility;

public class pch {
	
	static WebDriver driver=null;
	 Xls_Reader xls=null;
		
	
	@Test(dataProvider="getdata")
	public void testing(Hashtable<String,String> data)
	{
		
		driver=new FirefoxDriver();
		driver.get("http://nowriztech.com");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys(data.get("username"));
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys(data.get("password"));
		
	}
	
	@DataProvider
	
	public  Object[][] getdata()
	{
		xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");
		return utility.getdata("LoginTest", xls);
	}

}
