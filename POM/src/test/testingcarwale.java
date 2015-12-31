package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.carwale.pages.LandingPage;

public class testingcarwale {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.carwale.com");
     LandingPage lp=PageFactory.initElements(driver, LandingPage.class);

     lp.getNewCars("BMW", "X1");

	}

}
