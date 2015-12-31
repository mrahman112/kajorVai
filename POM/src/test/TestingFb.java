package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.facebook.pages.LoginPage;

public class TestingFb {

	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
         loginpage.doLogin("mdsapon@yahoo.com", "humaira1");
         
         
	}

}
