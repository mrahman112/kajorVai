package com.myproject.suitea;

public class login {

	public static void main(String[] args) {
		
		
		Xls_Reader xl=new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\myproject\\xls\\suite.xlsx");

		

if(!xl.getCellData("test suite", 2, 2).equalsIgnoreCase("n"))
{
	System.out.println(xl.getCellData("test suite", 0, 2));
}
	}

}
