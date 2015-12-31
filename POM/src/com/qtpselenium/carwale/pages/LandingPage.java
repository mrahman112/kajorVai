package com.qtpselenium.carwale.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	@FindBy(xpath="//*[@id='drpMakeNew']")
	public WebElement brand;
	@FindBy(xpath="//*[@id='tabs-list']/ul/li[2]/a")
	public WebElement budget;
	@FindBy(xpath="//*[@id='drpModelNew']")
	public WebElement model;
	@FindBy(xpath="//*[@id='divMakeNew']/input")
	public WebElement btnclick;
	public void getNewCars(String mybrand,String mymodel) throws InterruptedException
	{
		brand.sendKeys(mybrand);
		brand.sendKeys(Keys.ENTER);
		Thread.sleep(2000L);
		model.sendKeys(mymodel);
		btnclick.click();
		
	}
	
	public void getPriceQuote(String mybrand,String model)
	{
		
	}
	
	

}
