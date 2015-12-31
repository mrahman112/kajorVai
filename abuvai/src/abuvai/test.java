package abuvai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	 WebDriver driver=null;

		@BeforeTest
		public  void start()
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		@Test
		public  void logIn() throws InterruptedException
		{
			
			
			driver.get("http://gmail.com");
			driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("mizansapon");
			driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Jarjees1");
			driver.findElement(By.xpath("//*[@id='signIn']")).click();
			wait(5);
			String text=driver.findElement(By.xpath("//*[@href='https://mail.google.com/mail/u/0/#inbox']")).getText();
			System.out.println(text);
		}
		
		

}
