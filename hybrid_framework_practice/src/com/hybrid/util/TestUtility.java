package com.hybrid.util;

import java.util.Hashtable;

public class TestUtility {
	
	
	public static Object[][] getData(String testcase,Xls_Reader xl)
	{
		
		
		
		
		//row number on which test is lying
				int testcasestartrowno=1;
				while(!xl.getCellData("Data", 0, testcasestartrowno).equals(testcase))
				{
					testcasestartrowno++;
				}
				System.out.println("test case starts from "+testcasestartrowno);
				
				
				
				// rows of data
				int datastartrowno=testcasestartrowno+2;
				int rows=0;
				while(!xl.getCellData("Data", 0, datastartrowno+rows).equals(""))
				{
					rows++;
				}
				
				System.out.println("row no. for test data for "+testcase+" are "+ rows);
				
				//col number
				
				int colnumstartsrowno=testcasestartrowno+1;
				int cols=0;
				
				while(!xl.getCellData("Data", cols,colnumstartsrowno).equals(""))
				{
					cols++;
				}
				
				System.out.println("col no. for test data for "+testcase+" are "+ cols);
				
				//extract the data
				
				Object[][] data=new Object[rows][1];
				int index=0;
				
				Hashtable<String,String> table=null;
				
				for(int rnum=datastartrowno;rnum<datastartrowno+rows;rnum++)
				{
					table=new Hashtable<String,String>();
					for(int cnum=0;cnum<cols;cnum++)
					{
						String key=xl.getCellData("Data", cnum, colnumstartsrowno);
						String value=xl.getCellData("Data", cnum, rnum);
						table.put(key, value);
								
					}
					
					data[index][0]=table;
					index++;
				}
		return data;
	}
	
	
	public static boolean getRunmode(String testName,Xls_Reader xls)
	{
		
		for(int row=2;row<xls.getRowCount("TestSuite");row++)
		{
			String tsid=xls.getCellData("TestSuite", "TSID", row);
			if(tsid.equals(testName))
			{
				if(xls.getCellData("TestSuite", "Runmode", row).equals("y"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		}
		
		return false;
		
		
	}
	
	
}
