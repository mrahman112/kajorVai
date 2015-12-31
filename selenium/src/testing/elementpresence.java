package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class elementpresence {
	public static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		
		driver.get("http://nowriztech.com");
	if(isElementPresent("//*[@id='ContentPlaceHolder1_txtUserName1']"))
		System.out.println("hello");
		

	}
	
	public static boolean isElementPresent(String xpath)
	{
		try{
		driver.findElement(By.xpath(xpath));
		}catch(Exception e){
		
		return false;
		}
		return true;
	}

}
