import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HandlingCookies {

	public static void main(String[] args) {


		WebDriver driver =new FirefoxDriver();
		driver.get("http://nowriztech.com");
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("total cookies are "+cookies.size());
		
		Iterator<Cookie> iter=cookies.iterator();
		
		while(iter.hasNext())
		{
			Cookie c=iter.next();
			System.out.println(c.getDomain()+" "+c.getName()+"  "+c.getValue());
		}
		
		
		
	}
	
}