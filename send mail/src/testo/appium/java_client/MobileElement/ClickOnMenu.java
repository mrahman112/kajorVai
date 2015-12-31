package testo.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.AppiumStartandClose;



public class ClickOnMenu {

AndroidDriver dr;
DesiredCapabilities capabilities;
Properties or;
FileInputStream fs;




@BeforeTest
public void starter() throws ExecuteException, IOException, InterruptedException  
{
	
	AppiumStartandClose.startAppium();
	
	File app = new File(System.getProperty("user.dir")+"\\src\\com\\nbc\\mobile_apk\\com.nbcuni.nbc-1.apk");
	 capabilities = new DesiredCapabilities();
      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
      capabilities.setCapability("deviceName","Galaxy S4");
      capabilities.setCapability("platformVersion", "4.4.2");
      capabilities.setCapability("platformName","Android");
	   capabilities.setCapability("app", app.getAbsolutePath());
}
	
	@Test
	public void testApp() throws MalformedURLException, InterruptedException{
      dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      
  
      
     dr.findElement(By.id("android:id/up")).click();//clicking the menu option of homepage
      
     
     dr.findElements(By.className("android.widget.RelativeLayout")).get(5).click();//clicking the setting option
     Thread.sleep(2000);//in real time WebDriverWait should be used
    dr.findElement(By.id("com.nbcuni.nbc:id/provider_login_logout_text")).click();//clicking log in option
    dr.findElement(By.id("com.nbcuni.nbc:id/auth_welcome_button_continue")).click();

   dr.findElements(By.className("android.widget.RelativeLayout")).get(0).click();
   
 
   
  dr.findElement(By.xpath("//android.widget.EditText")).click();
  Thread.sleep(2000);//in real time WebDriverWait should be used
  WebElement me=dr.findElement(By.xpath("//android.widget.EditText"));

  TouchAction touch=new TouchAction(dr);
 
  touch.tap(me);
  
  
      
   
  dr.findElement(By.xpath("//android.widget.EditText[@index=4]")).sendKeys("hello");
  dr.findElement(By.xpath("//android.widget.EditText[@index=5]")).sendKeys("hello123");
  dr.hideKeyboard();
  
   dr.findElement(By.className("android.widget.Button")).click();//click on login button
   Thread.sleep(5000);
   
   String expectedErrorText="The username and password entered do not match. Please try again.";
   
   int x=dr.findElements(By.xpath("//android.view.View")).size();
   System.out.println(x);
   
   
//String actualErrorText=dr.findElement(By.xpath("//android.view.View[@index=4]")).getAttribute("content-desc");
  // UiObject PatInfo1 = new UiObject();
//UiObject PatInfo = new UiObject(new UiSelector().className("android.view.View").index(3));
//UiObject Enteries = PatInfo.getChild(new UiSelector().className("android.view.View").index(4));

//String actualErrorText=dr.findElement(By.className("android.view.View")).findElements(By.className("android.view.View")).get(5).getText();
//String actualErrorText=Enteries.getContentDescription();
  //String actualErrorText=dr.findElementByAndroidUIAutomator("UiSelector().className(\"android.view.View\").className(\"android.view.View\").index(4))").getText();

 // UiObject u=new UiObject();
//System.out.println(dr.findElementByAndroidUIAutomator("UiObject(\"UiSelector().className(\"android.view.View\")).getContentDescription ()"));
  //String actualErrorText= dr.findElement(By.name("content-description")).getText();
   //String actualErrorText=dr.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.nbcuni.nbc:id/frag_area\").className(\"android.view.View\").text(\"The username and password entered do not match. Please try again.\")").getText(); 
 
   //Assert.assertEquals(actualErrorText, expectedErrorText);
  // System.out.println(y);
   
   int i=dr.findElements(By.xpath("//android.view.View[@index=4]")).size();
String a=dr.findElements(By.xpath("//android.view.View[@index=4]")).get(0).getText();
String b=dr.findElements(By.xpath("//android.view.View[@index=4]")).get(1).getText();
System.out.println(i); 
System.out.println(a);
System.out.println(b);

Thread.sleep(5000);
      
      
      	}

@AfterTest
public void quit() throws ExecuteException, IOException, InterruptedException{
	
	if(dr!=null)
	dr.quit();
	
	Thread.sleep(2000);
	AppiumStartandClose.closeAppium();
	
	
}

}
