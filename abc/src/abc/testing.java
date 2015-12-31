package abc;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xml.sax.SAXException;

public class testing {
	
	public static void main(String[] args) throws MalformedURLException, ParserConfigurationException, SAXException, IOException, InterruptedException{
		
		Information i=new Information();
		//i.getShowInfoByNameEpisodes("It Takes A Choir");
		//i.getShowInfoByNameEpisodes1("Benched");
		//i.getShowInfoByNameEpisodes2("Burn Notice");
		//i.getShowInfoByNameEpisodes3("Chrisley Knows Best");
		//i.getShowInfoByNameClips("Dig");
		
		/*
		  Benched
Burn Notice
Chrisley Knows Best
Covert Affairs
Dig*
Graceland
It Takes A Choir
Partners in Crime
Playing House
Royal Pains
Satisfaction
Sirens
Suits
Vanderbilt MDs
White Collar
*/
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://idm.east.cox.net/coxlogin/ui/tvonline?TYPE=33554432&REALMOID=06-00071404-a0b8-126a-9c4f-41c4ac121016&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-JeTd0c8Ox39f8%2bpLz%2ffLWSRjTrB%2fWNHdbR3yhOmzibW%2bQxJizWocNKGSJvp5ncvs&TARGET=-SM-HTTPS%3a%2f%2fidm%2eeast%2ecox%2enet%2faffwebservices%2fsyfy%2fredirect%2ejsp%3fSAMLRequest%3djZNPj9MwEMXvfIrId-%2Bd-%2Fu1uryapsWVFpgdBmOXBBTjKhlhI7eJxu-%2B-%2B1xk5YtrChcRzO-%2F9zxvPL-%2Fbt42zA41CyYQErk8ckKWqhPyekKf8gd6Su-%2FTNHHnbhB1b9GYr1-%2FCjBzTOAhG0sXP3SmLfgt6A3okSntaPCdka0yHzPOxcbodcXqkC3FK1tuIdad5m8eHxFYI4S4sWkpvBz5kiqtYFjsYC9q4Ew-%2BI48nhdP0OBoyh6XV80ohzYIaIizoPSJQyOE1LzBoE4q2VCvgV8ElVxNaU307Ck8e2kpMVtFNFgGoUwmc7iaVnaVsw4otjByzBiDyuJhkuTkNAPJtS-%2FoX6cBzGLfObP3Fkw-%2BUqcTCujStW8FXJcY68lUxwFMslbQGZKdnw8C12fFWMTsvd5ntHs0yYnzpdzHOExDhuQRDYGcJ3VnYRJOubFBsf6knAdwM9xkPRXfnbKfR2ikrSALW9qqmoPD-%2FVh7l1KpueDebc3II-%2BPwXRutrozB7YG7JSscnXyNZb-%2Fbuz8KgZ7Y5uFrmjHtTn8y-%2BPc-%2B1MwPZn83dap9NGKrpaZsjd0cBZNo57vNXBj4ze6h-%2BGaWm6u7-%2B9YERWth1ZmNLcaIA1xNtkR-%2F7nnjagF6Ivv8Z-%2FrJd6L-%2BctPmP4E%26RelayState%3d_963d6def--b5d8--4ff9--87aa--21ce2cf7a96c%26SigAlg%3dhttp-%3A-%2F-%2Fwww%2ew3%2eorg-%2F2000-%2F09-%2Fxmldsig-%23rsa--sha1%26Signature%3dKRIB008usL98epB6ekAwIn5x1JAFvjvDQmcOhWPSxwgogKrvJoxeNG9kdSZDsUmoph47u8Z-%2Bwxn9p4He50tf83HbRXbq1GaeiSJFbns4XbIxiG3ezg7U2a9XBr2f35Na8jWUUoVPxSIoJ9YNXiD-%2Fx05HZQrElm-%2Fn-%2BjboBp3dLbTzel97g8wAohZJv2E2ABxkJhTbymDsaqD6DF0yEvxYtYjAsAEqcnEgq-%2Bgj-%2BAoLH1l98sblxKHWxaD3xY2-%2BIonuyPAyFil2QIIPGB3LdFdhHuT1AHSCr7jURb48TYpf2KHAWgGB2fuTJj-%2Bk2J5r8WGHOJaxq9wk960LrgYXUaIJAQ-%3D-%3D%26SMPORTALURL%3dhttps-%3A-%2F-%2Fidm%2eeast%2ecox%2enet-%3A443-%2Faffwebservices-%2Fpublic-%2Fsaml2sso");
		driver.findElement(By.xpath("//*[@id='pf-location-close-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name='LoginPage']/input[1]")).sendKeys("mdsaon");
		driver.findElement(By.xpath("//form[@name='LoginPage']/input[2]")).sendKeys("mdsaon");
		
	}

}
