import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class roughwork {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://ebay.com");
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();

	}

}
