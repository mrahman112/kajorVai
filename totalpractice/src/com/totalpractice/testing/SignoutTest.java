package com.totalpractice.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SignoutTest {
	
	@Test
	public void logOut()
	{
		System.out.println("logged out");
		throw new SkipException("test case is skipping");
	}

}
