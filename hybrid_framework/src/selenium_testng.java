import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class selenium_testng {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		driver.manage().window().maximize();
		//*[@id='username']
		//*[@id='.save']
		//*[@id='fsLogin']/div/strong
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");
		driver.findElement(By.xpath("//*[@id='.save']")).click();
		String actual=driver.findElement(By.xpath("//*[@id='fsLogin']/div")).getText();
		String expected="Invalid ID or password. Please try again using your full Yahoo ID.";
		System.out.println(actual);
		if(expected==actual)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		

	}

}
