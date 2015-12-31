import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumPractice {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	/*System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver driver1=new ChromeDriver();
	driver1.get("http://yahoo.com");
	*/
	
	//File IEDriver = new File("C:\\selenium\\IEDriverServer.exe file");
	 // System.setProperty("webdriver.ie.driver", "C:\\selenium\\IEDriverServer.exe");  
	  //driver = new InternetExplorerDriver();
	
	 
	 driver.get("http://yahoomail.com");
	System.out.println(driver.findElement(By.xpath("//*[@id='yucs-logo_link']")).getText());

	}

}
