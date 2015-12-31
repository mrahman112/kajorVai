package com.yahoo.rough;

import com.yahoo.util.TestUtil;
import com.yahoo.util.Xls_Reader;

public class hashtabul {

	public static void main(String[] args) {
		
		Xls_Reader xls=new Xls_Reader("C:\\Users\\Humaira.Jarjees\\Documents\\hybridexcelframework.xlsx");

		System.out.println(TestUtil.getdata("LoginTest", xls));
		System.out.println(TestUtil.getdata("CreateLeadTest", xls));
		System.out.println(TestUtil.getdata("MenuTest", xls));
	}

}
