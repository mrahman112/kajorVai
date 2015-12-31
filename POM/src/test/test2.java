package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yahoo.com");
		//String x=driver.findElement(By.cssSelector("div[class='main content clearfix'] div[class='banner'] h1")).getText();
		//System.out.println(x);
		
		//driver.findElement(By.cssSelector("input[id$='-p']")).sendKeys("hello");
		//Thread.sleep(2000L);
		//String x=driver.findElement(By.xpath("//*[@id='p_13838465-results']/li[1]/a")).getText();
		//System.out.println(x);
		//driver.findElement(By.xpath("//a[contains(@id, 'yui_3_8_1_1_14123')]")).click();
		driver.findElement(By.linkText("My Yahoo")).click();
	}

}
