package rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class testbase {
	public static WebDriver driver=null;
	public static Xls_Reader xl=null;
	


	public void intitialize()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 driver=new FirefoxDriver();
		//driver=new ChromeDriver();
		 driver.get("http://yahoo.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 xl=new Xls_Reader(System.getProperty("user.dir")+"src\\rough\\ebaylogin.xlsx");
	}
	
}
