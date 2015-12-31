import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Gmail {

	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		 
		
		driver=new FirefoxDriver();
		driver.get("http://.gmail.com");


		
		input("userid","username");
		input("//*[@id='Passwd']","Jarjees1");
		click("//*[@id='signIn']");

		Thread.sleep(5000);
		
		String expected="+mizan";
		
		validation("//*[@id='gb']/div[1]/div[1]/div[1]/div/a",expected);
		


	}
	
	public static void input(String xpath,String value)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
    }
	
	public static void click(String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void validation(String xpath,String expected)
	{
		String actual=driver.findElement(By.xpath(xpath)).getText();
		Assert.assertEquals(actual, expected);
		
	}
	
	
	
	

}
