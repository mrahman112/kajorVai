package newlesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class secondjava {
	
	static secondjava s;
	
	
	
	private secondjava()
	{
		System.out.println("hello");
	}
	
	public static secondjava getinstance()
	{
		
		if(s==null)
		{
			s=new secondjava();
		}
		return s;
		
	}
	
	public void initialize()
	{
		
		WebDriver driver=new FirefoxDriver();
		
		
	}

}
