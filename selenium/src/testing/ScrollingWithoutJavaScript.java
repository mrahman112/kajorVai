package testing;

import org.dom4j.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class ScrollingWithoutJavaScript {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://stackoverflow.com/questions/3401343/scroll-element-into-view-with-selenium");
		

		WebElement element=driver.findElement(By.xpath("//*[@id='link-post-24442924']"));
Actions builder=new Actions(driver);
builder.moveToElement(element).keyDown(element, Keys.ARROW_DOWN).build().perform();

        
		
		

	}

}
