package test;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Starter {
	
	@BeforeTest
	public void start() throws ExecuteException, IOException{
		AppiumStart.startAppium();
	}
	
	
	@AfterTest
	public void close() throws ExecuteException, IOException{
		AppiumStart.closeAppium();
	}

}
