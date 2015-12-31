package test;

import org.testng.annotations.Test;

public class SendingMail2 extends EmailableReportSent{
	
	@Test(priority=2)
	public void sentMail()
	{
		System.out.println("this is 2nd mail");
	}

}
