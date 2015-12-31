package testing;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class yahootestng {
	
	@Test
	public void testing()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://nowriztech.com");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys("mizan101");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtPassword']")).sendKeys("nts123");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		
		String actualtitle=driver.findElement(By.id("ContentPlaceHolder1_lblname")).getText();
		String expectedtitle="Welcome Mizanur Rahman";
		Assert.assertEquals(expectedtitle, actualtitle);
	}

}
