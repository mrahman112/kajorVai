import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Facebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://en.wikipedia.org/wiki/HTTP_404#404_page_widgets");
		System.out.println(driver.getTitle());
		/*
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mdsapon@yahoo.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("humaira1");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		Thread.sleep(7000L);
		driver.findElement(By.xpath("//div[text()='Search for people, places and things']")).sendKeys("hello");
		*/
	}

}