package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findelements {

	public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();

driver.get("http://calculator.net");

List<WebElement> links=driver.findElements(By.tagName("a"));



System.out.println(links.size());

for(int i=0;i<links.size();i++)
{

System.out.println(links.get(i).getText());
}

System.out.println("***********************************************");

WebElement box=driver.findElement(By.xpath("//*[@id='hl2']"));

 List<WebElement> specicLinks=box.findElements(By.tagName("a"));
 
 System.out.println(specicLinks.size());
 
 for(int i=0;i<specicLinks.size();i++)
	 
 {
	 System.out.println(specicLinks.get(i).getText());
 }


		
		

	}

}
