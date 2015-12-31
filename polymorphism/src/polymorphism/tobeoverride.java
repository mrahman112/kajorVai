package polymorphism;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class tobeoverride {

	

@Test
public void test1()

{
	System.out.println("hello");
	throw new SkipException("skipping the test");
}

@Test
public void test2()
{
	System.out.println(this.getClass().getSimpleName());
}
@Test
public void test3()
{
	
	System.out.println("hello2");
	throw new SkipException("skipping the test");
}
	
}
