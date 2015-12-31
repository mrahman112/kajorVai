package rough;
import java.util.concurrent.TimeUnit;










import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testingwithtestng {
	
	public static WebDriver driver=null;
	public static Xls_Reader xl=null;
	
	@BeforeTest
	
	public static void initialize()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 //driver=new FirefoxDriver();
		driver=new ChromeDriver();
		 driver.get("http://yahoo.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 xl=new Xls_Reader(System.getProperty("user.dir")+"src\\rough\\ebaylogin.xlsx");
		 
	}
	
	
	
	@Test
	public static void testing()
	{
		Actions action = new Actions(driver);
		WebElement mailElement = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/ul/li[3]/div/div/a/span"));
		action.moveToElement(mailElement).build().perform();
		mailElement.click();
		                  
		
		 
	
		driver.findElement(By.xpath("//*[@id='nav-mail']")).click();
		                  
		WebElement userName = driver.findElement(By.xpath("//*[@id='username']"));
		userName.click();
		userName.sendKeys("userid");
		
		
		//driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("passwd");
		
	}
	
	/*@DataProvider
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
