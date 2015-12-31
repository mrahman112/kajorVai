package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class SendingMail extends EmailableReportSent{
	
	
	@Test(priority=1)
	public void sendmail(){
		System.out.println("hello");
	}
	

}
