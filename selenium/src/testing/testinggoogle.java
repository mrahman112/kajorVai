package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testinggoogle {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://timesofindia.com");
	
	WebElement fm=driver.findElement(By.id("mailroifrm12"));
	driver.switchTo().frame(fm);
	
	
	String text=driver.findElement(By.xpath("//*[@id='mathq2']")).getText();
	
	
	String []s=text.split(" ");
	
	
	System.out.println("length of your text is "+s.length);
	int result=Integer.parseInt(s[0])+Integer.parseInt(s[2]);
	

	System.out.println("your result is "+result);
driver.findElement(By.xpath("//*[@id='mathuserans2']")).sendKeys(String.valueOf(result));
System.out.println(text);
driver.switchTo().defaultContent();


	}

}
