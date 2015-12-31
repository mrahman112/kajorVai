package seleniumRC;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class RcProject {

	public static void main(String[] args) {
		Selenium sel=new DefaultSelenium("localhost",4444,"*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://google.com");
        sel.start();
        sel.open("/");
	}

}
