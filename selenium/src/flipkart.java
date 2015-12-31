import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class flipkart {
	
	static WebDriver driver=null;
	public static void main(String[] arg) throws InterruptedException
	{
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://www.hdfc.com/others/homeline.asp");
		//driver.findElement(By.xpath("//*[@id='acc-1-head-2']/a")).click();
		//Thread.sleep(3000L);
		//driver.findElement(By.xpath("//*[@id='acc-1-section-2']/li[2]/a")).click();
		//Thread.sleep(3000L);
		//driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td/p[2]/a")).click();
		//driver.findElement(By.xpath("//*[@id='login_email_id']")).sendKeys("mizan");
		driver.findElement(By.linkText(" Call Us")).click();
		
		
		Set<String> winid=driver.getWindowHandles();
		System.out.println(winid.size());
		
		Iterator<String> it=winid.iterator();
		
		String mainwindow=it.next();
		String secondwindow=it.next();
		
		driver.switchTo().window(secondwindow);
		driver.findElement(By.partialLinkText("For any")).click();
		driver.findElement(By.xpath("//*[@id='selCountry']")).sendKeys("QATAR");
		
		
		
	}
	}
