package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

public class roughwork {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://nowriztech.com");
		
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys("mizan101");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("nts123");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		System.out.println(driver.getTitle());
		
		String actual=driver.getTitle();
		String expected="ariztech";
		
		Assert.assertEquals(actual, expected);
		
	
		
		//*[@id='email']
	}

	private static Function<? super WebDriver, Object> visibilityOfElementLocated(
			By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
