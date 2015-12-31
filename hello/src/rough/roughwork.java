package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.Xls_Reader;

public class roughwork {

	public static void main(String[] args) {


		
		Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\date.xlsx");

		String x=xls.getCellData("Sheet1", 0, 1);
	     System.out.println(x);
	 	WebDriver driver=new FirefoxDriver();
		driver.get("http://nowriztech.com");
		driver.findElement(By.xpath("//*[@id='ContentPlaceHolder1_txtUserName1']")).sendKeys(x);
	}

}
