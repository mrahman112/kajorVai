package testing;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngroughwork {

	
	@BeforeTest
	public void start()
	{
		
		System.out.println("before the testing");
		
	}
	
	@Test
	public void test1()
	{
		
		System.out.println("this is test 1");
		
		
	}
	@Test
	public void test2()
	{
		
		
		throw new SkipException("test2 is skipped");
		
		
		
	}


}

