package com.totalpractice.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class MenuTest {
	
	
	@Test
	public void checkMenu()
	{
		
		System.out.println("menu checking");
		throw new SkipException("test case is skipping");
		
	}

}
