package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://quikr.com");
	
		
		String windhandle=driver.getWindowHandle();
		for(String win:driver.getWindowHandles())
		{
			driver.switchTo().window(windhandle);
		}
		//System.out.println(driver.findElement(By.xpath("//*[@id='rtmDF']/div/ul/li/map/area[1]")).getAttribute("alt"));
		
		driver.findElement(By.xpath("//*[@id='csclose']/strong")).click();
		
		
		driver.findElement(By.xpath("//*[@id='main_textarea']/div/div[4]/div[3]/div[1]/a")).click();
		
		List<WebElement>box=driver.findElements(By.className("white_box"));
		System.out.println(box.size());
		List<WebElement>boxes=box.get(1).findElements(By.tagName("a"));
		System.out.println(boxes.size());
		
		Thread.sleep(4000L);
		for(int i=0;i<boxes.size();i++)
		{
			System.out.println(boxes.get(i).getText());
		}
		
		
		
		
		
		
		
	}

}
