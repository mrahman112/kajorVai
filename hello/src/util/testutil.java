package util;

import org.openqa.selenium.By;

import base.TestBase;

public class testutil extends TestBase{
	
	
	public static Object[][] getdata(Xls_Reader xls,String testname)
	{
		int rows=xls.getRowCount(testname);
		int cols=xls.getColumnCount(testname);
		
		Object[][] data=new Object[rows-1][cols];
		
		for(int row=2;row<=rows;row++)
		{
			for(int col=0;col<cols;col++)
			{
				data[row-2][col]=xls.getCellData(testname, col, row);
			}
		}

		
		return data;
}
	
	public static boolean getrunmode(Xls_Reader xls,String testname)
	{
		
		boolean isExecutable=false;
	for(int i=2; i <= xls.getRowCount("testcase") ;i++ ){
		//String suite = xls.getCellData("Test Suite", "TSID", i);
		//String runmode = xls.getCellData("Test Suite", "Runmode", i);
	
		if(xls.getCellData("testcase", "tcid", i).equalsIgnoreCase(testname)){
			if(xls.getCellData("testcase", "runmode", i).equalsIgnoreCase("Y")){
				isExecutable=true;
			}else{
				isExecutable=false;
			}
		}

	}
	xls=null; // release memory
	return isExecutable;
	
	}
	
	public static void click(String xpath)
	{
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
	}
	
	public static void input(String xpath,String text)
	{
		driver.findElement(By.xpath(or.getProperty(xpath))).sendKeys(text);
	}
	
	public static void signout(String xpath)
	{
		driver.findElement(By.xpath(or.getProperty(xpath))).click();
	}


}