package testing;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class testutil extends testbase{

	
	
	
	@DataProvider
	public static Object[][] getdata(String testname,Xls_Reader xls)
	{
		
		
		int rows=xls.getRowCount(testname);
		int cols=xls.getColumnCount(testname);
		Object[][] data=new Object[rows-1][cols];
		
		Hashtable<String,String> table=null;
		int index=0;
		for(int i=2;i<=rows;i++)
		{
			
			table=new Hashtable<String,String>();
			for(int j=0;j<cols;j++)
			{
				String key=xls.getCellData(testname, j, 1);
				String value=xls.getCellData(testname, j, i);
				//data[i-2][j]=xl.getCellData("Sheet1", j, i);
				table.put(key, value);
				
			}

			data[index][0]=table;
		
	}
		return data;
		

		/*
		Object [][]data=new Object[2][2];
		data[0][0]="muradpur200";
		data[0][1]="humaira";
		
		data[1][0]="muradpur2001";
		data[1][1]="humaira1";
		return data;
		*/
	}
	
}
