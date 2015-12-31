package test;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;

import util.testutil;
import base.TestBase;

public class TestBasesuite extends TestBase{
	
	@BeforeTest
	public static void start() throws IOException
	{
		
		initialize();
	}

}
