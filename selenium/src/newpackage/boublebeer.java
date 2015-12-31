package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class boublebeer {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.baublebar.com/zen-gem-drops-earrings.html");
		driver.manage().deleteAllCookies();
		
		
		
		
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//WebElement fm=driver.findElement(By.id("__cvo_iframe"));
	driver.switchTo().frame(6);
	WebElement element = driver.findElement(By.id("gbqfd"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("document.getElementById('bouncex_el_3').click();");
	//driver.findElement(By.xpath("//*[@name='3_name']")).click();
	
	
	driver.findElement(By.xpath("//*[@id='product_addtocart_form']/div[3]/div/a[1]")).click();
	//driver.findElement(By.xpath("//*[@id='bouncex_el_2']/input")).click();

	}

}
