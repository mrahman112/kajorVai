package com.yahoo.util;

import java.util.Hashtable;

public class TestUtil {
	
	public static Object[][] getdata(String testcase,Xls_Reader xls)
	{
		//testcase start row number
		
		
		
		int testcasestartrowno=1;
		
		while(!xls.getCellData("Data", 0,testcasestartrowno ).equals(testcase))
		{
			testcasestartrowno++;
		}
		
		System.out.println("testcase "+testcase+" is starting at "+testcasestartrowno);
		
		
		// total rows per testcase
		
		int datastartrow=testcasestartrowno+2;
		int row=0;
		

		while(!xls.getCellData("Data", 0,datastartrow+row ).equals(""))
		{
			row++;
		}
		
		System.out.println("total row of "+testcase+" are "+row);
		
		// total column per testcase
		
		int columnstartrowno=testcasestartrowno+1;
		int col=0;
		
		while(!xls.getCellData("Data", col,columnstartrowno).equals(""))
		{
			col++;
		}
		
		System.out.println("total column of "+testcase+" are "+col);
		
		//creating hashtable
		
		Object[][] data=new Object[row][1];
		Hashtable<String,String> table=null;
		int index=0;
		
		//get the data
		
		for(int r=datastartrow;r<datastartrow+row;r++)
		{
			table=new Hashtable<String,String>();
			for(int c=0;c<col;c++)
			{
				String key=xls.getCellData("Data", c, columnstartrowno);
				String value=xls.getCellData("Data", c, r);
				table.put(key, value);
			}
			
			data[index][0]=table;
			index++;
		}
		
		
		
		
		return data;
	}

}
