package com.hybrid.roughwork;

import com.hybrid.util.TestUtility;
import com.hybrid.util.Xls_Reader;

public class Hashtablepractice {

	public static void main(String[] args) {
		
		
		Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");
        
		
		
	TestUtility.getData("LoginTest", xls);
	TestUtility.getData("CreateLeadTest", xls);
	TestUtility.getData("MenuTest", xls);
	
	System.out.println(TestUtility.getRunmode("LoginTest", xls));
	System.out.println(TestUtility.getRunmode("CreateLeadTest", xls));
	System.out.println(TestUtility.getRunmode("MenuTest", xls));
	
	
	
	}

}
