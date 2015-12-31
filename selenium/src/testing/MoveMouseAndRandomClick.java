package testing;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseAndRandomClick {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://americangolf.co.uk");
		
		WebElement mousemove=driver.findElement(By.xpath("//*[@id='navigation']/nav/ul/li[1]/a"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(mousemove).build().perform();
		
		WebElement box=driver.findElement(By.xpath("//*[@id='CLUBS_1']/div[1]"));
		
		List<WebElement> allLinks=box.findElements(By.tagName("a"));
		
		System.out.println("total links in the box are "+allLinks.size());
		
		//to randomely select the link
		
	
		int total=allLinks.size();
		Random r=new Random();
		allLinks.get(r.nextInt(total)).click();
	}

}
