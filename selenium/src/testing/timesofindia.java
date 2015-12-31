package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class timesofindia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://timesofindia.indiatimes.com");
		WebElement fm=driver.findElement(By.id("mailroifrm12"));
		driver.switchTo().frame(fm);
		
		String a=driver.findElement(By.xpath("//*[@id='mathq2']")).getText();
		String []parts=a.split(" ");
		for(int i=0;i<parts.length;i++)
		{
		System.out.print(parts[i]);
		
		
		}
		
		int b=Integer.parseInt(parts[0])+Integer.parseInt(parts[2]);
		System.out.print(b);
		
		
		driver.findElement(By.xpath("//*[@id='mathuserans2']")).sendKeys(String.valueOf(b));
		
	
	
	}
	}