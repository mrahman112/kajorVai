package com.totalpractice.util;

import com.totalpractice.testing.TestSuiteBase;





public class TestUtil {
	
	//public static Xls_Reader xl=null;
	
	public static Object[][] getdata(Xls_Reader xl,String testcase)
	{
		//xl=new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\totalpractice\\config\\ebaylogin.xlsx");
		
		int rows=xl.getRowCount(testcase);
		int cols=xl.getColumnCount(testcase);
		Object[][] data=new Object[rows-1][cols];
		for(int i=2;i<=rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i-2][j]=xl.getCellData(testcase, j, i);
			}
		
		//data[0][0]="humaira";
		//data[0][1]="humaira1";
		
		
	}
		return data;
		
	}

}
