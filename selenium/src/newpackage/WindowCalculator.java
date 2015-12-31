package newpackage;

import org.testng.Assert;
import org.testng.annotations.Test;




public class WindowCalculator {
	
	@Test
	public void testCalculator()
	{
		int actual=getWindowCalc(3,"+",2);
		System.out.println(actual);
		
		int expectedValue=5;// This value can be read from the Excel file
		Assert.assertEquals(getWindowCalc(3,"+",2), expectedValue);
		
	}

	
	
	
	public static int getWindowCalc(int a,String p,int c)
	{
		int result=0;
		
		if(p=="+")
		{
			result=a+c;
		}else if(p=="-")
		{
			result=a-c;
		}else if(p=="*")
		{
			result=a*c;
		}else if(p=="/")
		{
			result=a/c;
		}
		
		return result;
		
		
	}

}
