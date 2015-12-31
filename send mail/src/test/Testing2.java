package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Testing2 {
	
	@AfterSuite
	public void start() throws InterruptedException{
		
		EmailableReportSent.mailing();
		
		
	}
	
	

}
