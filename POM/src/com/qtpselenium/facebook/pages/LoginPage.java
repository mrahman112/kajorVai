package com.qtpselenium.facebook.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	WebDriver driver=null;
	@FindBy(xpath="//*[@id='email']")
	public WebElement username;
	@FindBy(xpath="//*[@id='pass']")
	public WebElement password;
	
	public LoginPage(WebDriver dr)
	{
		driver=dr;
	}
	
	public void doLogin(String userid,String passwd)
	{
		username.sendKeys(userid);
		password.sendKeys(passwd);
		password.sendKeys(Keys.ENTER);
	}

}
