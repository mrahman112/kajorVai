package test;


import util.TestUtil;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration extends TestBase{
	
	
	@Test(dataProvider="testData")
	public void registrationTest(String fname,String lname,String email,String passwd,String confpasswd,boolean testType){
		
		driver.get(config.getProperty("testsiteurl"));
       getObject("registrationlink").click();
	   getObject("registration_firstname").sendKeys(fname);
	   getObject("registration_lastname").sendKeys(lname);
	   getObject("registration_eamil").sendKeys(email);
	   getObject("registration_passwd").sendKeys(passwd);
	   getObject("registration_confpasswd").sendKeys(confpasswd);
	   //getObject("registration_submitt").click();
	   
	   if(testType){
		   String actual_erroremail_msg= getObject("email_exist_msg").getText();
	       String expected="Your email address is already registered with eBay. Did you forget your user ID or password?";
	Assert.assertEquals(expected, actual_erroremail_msg);
	   
	   }
	
		
	}
	
@DataProvider
	
	public Object[][] testData()
	{
		return TestUtil.getData(Sheet);
	
	/*Object data[][]=new Object[2][6];
		
		//1st row
		data[0][0]="mizanur";
		data[0][1]="rah";
		data[0][2]="muradpur2002@yahoo.com";
		data[0][3]="mizanur123";
		data[0][4]="mizanur123";
		data[0][5]=true;
		//2nd row
		data[1][0]="mizanur";
		data[1][1]="rah";
		data[1][2]="muradpur20020@yahoo.com";
		data[1][3]="mizanur123";
		data[1][4]="mizanur123";
		data[1][5]=false;
		return data;
		*/
	}

}
