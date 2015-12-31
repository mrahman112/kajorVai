package test;

import java.util.concurrent.TimeUnit;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver=null;
     public static Xls_Reader datatable=null;
	
     
     @BeforeSuite
	public static void initializeBrowser()
	{
    	 
    	 
		driver=new FirefoxDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		datatable=new Xls_Reader("C:\\Users\\Public\\Documents\\ebaylogin.xlsx");
	}
	
	@Test(dataProvider="getData")
	public static void login(String userid,String password)
	{
		
		driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();
		
		driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='sgnBt']")).click();
		
	String actual=(driver.findElement(By.xpath("//*[@id='gh-ug']")).getText());
	String expected="Hi, md!";
     Assert.assertEquals(expected, actual);
		
		
	}
	
	@DataProvider
	
	public static Object[][] getData(String Sheetname)
	{
		
		
		int row=datatable.getRowCount(Sheetname);
		int col=datatable.getColumnCount(Sheetname);
		Object data[][]=new Object[row-1][col];
		for(int r=2;r<=row;r++)
		{
			for(int c=0;c<=col;c++ )
				
			{
				data[r-2][c]=datatable.getCellData(Sheetname, c, r)	;
			}
		}
		
		
		
		
		//data[1][0]="muradpur101";
		//data[1][1]="humaira11";
		return data;
	}

}
