package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumpractice.Xls_Reader;


public class Selenium {

	public static void initialize()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 //driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		 driver.get("http://yahoo.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //xl=new Xls_Reader(System.getProperty("user.dir")+"src\\rough\\ebaylogin.xlsx");
		 
	}
	
	
	
	/*@Test(dataProvider="getData")
	public static void testing(String userid,String passwd)
	{

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 //driver=new FirefoxDriver();
		driver=new ChromeDriver();
		 driver.get("http://yahoo.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 xl=new Xls_Reader(System.getProperty("user.dir")+"src\\rough\\ebaylogin.xlsx");
	
		driver.findElement(By.xpath("//*[@id='nav-mail']")).click();
		                  
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(passwd);
		
	}
	
	@DataProvider
	public static Object[][] getData(Xls_Reader xl,String sheetname)
	{
		
		
		int rows=xl.getRowCount(sheetname);
		int cols=xl.getColumnCount(sheetname);
		
		Object[][]data=new Object[rows-1][cols];
		
		
		for(int rownum=2;rownum<=rows;rownum++)
		{
		 for(int colnum=0;colnum<cols;colnum++)
		 {
			 data[rownum-2][colnum]=xl.getCellData(sheetname, colnum, rownum);
		 }
		}
		
		
		
		return data;
		
	}
	*/


}
