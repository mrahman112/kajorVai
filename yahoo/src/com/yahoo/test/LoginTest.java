package com.yahoo.test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yahoo.util.Keywords;
import com.yahoo.util.TestUtil;
import com.yahoo.util.Xls_Reader;

public class LoginTest {
	Keywords k=Keywords.getInstances();
	Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");

	
	@Test(dataProvider="getData")
	public void doLogin(Hashtable<String,String> data)
	{
		
		k.openbrowser("http://yahoomail.com");
		k.input("//*[@id='username']", data.get("username"));
	}
	
	
	@DataProvider
	public  Object[][] getData()
	{
		return TestUtil.getdata("LoginTest", xls);
	}
	

}
