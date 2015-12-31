package testing;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practicehashtable {
	
	static Xls_Reader xls=null;

	
	
	
	@Test(dataProvider="getData")
	
	public void dologin(Hashtable<String,String> data)
	{
		xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\workspace\\selenium\\src\\testing\\ebaylogin.xlsx");

		executeKeyWord("Sheet1", xls, data);
	}
	
	
	@DataProvider
	public  Object[][] getData()
	{
		
		return testutil.getdata("Sheet1", xls);
	}	
	
	public static void executeKeyWord(String testname,Xls_Reader xls,Hashtable<String,String> table)
	{
		
		int rows=xls.getRowCount("Sheet1");
		for(int row=2;row<=rows;row++)
		{
			String tcid=xls.getCellData("Sheet1","userid" , row);
			String keyword=xls.getCellData("Sheet1","password" , row);
			
			
			System.out.println(tcid+keyword);
		}
		
	}
}