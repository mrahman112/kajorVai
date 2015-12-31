package testsuite;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before the test this will execute");
	}
	
	
	
	@Test
	
	public void test1()
	{
		
	
		System.out.println("this is test1");
		throw new SkipException("test case is skipping cause runmode is no");
		
	}
    @Test
	
	public void test2()
	{
		System.out.println("this is test2");
	}
    @Test

    public void test3()
   {
	System.out.println("this is test3");
	throw new SkipException("test case is skipping cause runmode is no");
    }

}
