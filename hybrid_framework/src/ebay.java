import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ebay {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.ebay.com");
		
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[2]/div[1]/table/tbody/tr/td[3]/form/table/tbody/tr/td[2]/div/select"));
		action.moveToElement(we).click().perform();
		driver.findElement(By.xpath("//*[@id='gh-cat-box']")).sendKeys("Art");
		
		
		

	}

}
