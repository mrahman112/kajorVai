package util;

import java.util.Hashtable;

public class utility {
	
	public static Object[][] getdata(String testname,Xls_Reader xls)
	{
		//test start row no.
		int teststartrowno=1;
		
		while(!xls.getCellData("Data", 0, teststartrowno).equals(testname))
		{
			teststartrowno++;
		}
		
		System.out.println("test case start row no "+teststartrowno);
		
		//data start row no
		
		int datastartrowno=teststartrowno+2;
		int row=0;
		
		while(!xls.getCellData("Data", 0, datastartrowno+row).equals(""))
		{
			row++;
		}
		
		System.out.println("total rows per test case are "+row);
		
		//number of column per test case
		
		int col=0;
		
		while(!xls.getCellData("Data", col, teststartrowno+1).equals(""))
		{
			col++;
		}
		
		System.out.println("total col per test case are "+col);
		
		//get the dATA
		Object[][] data=new Object[row][1];
		Hashtable<String,String> table=null;
		int index=0;
		
		for(int rowno=datastartrowno;rowno<datastartrowno+row;rowno++)
		{
			table=new Hashtable<String,String>();
			
			for(int colno=0;colno<col;colno++)
			{
				String key=xls.getCellData("Data", colno, teststartrowno+1);
				String value=xls.getCellData("Data", colno, rowno);
				//System.out.print(key+"  ");
				
				//System.out.print(value+"  ");
				
				table.put(key, value);
			}
			
			data[index][0]=table;
			index++;
			//System.out.println();
		}
			
			
		return data;
	}

}
