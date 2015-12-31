package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiconstructor {
	
	static WebDriver driver=null;
	
	public multiconstructor()
	{
		System.out.println("hello");
	}
	
	public multiconstructor(int a)
	{
		System.out.println(a+"hello");
	}
	
	public multiconstructor(int a,int b)
	{
		System.out.println(a+b+"hello");
	}
	public multiconstructor(int a,int b,int c)
	{
		System.out.println("hello"+a+b+c);
	}
	
	
	

	public static void main(String[] args) {
		
		multiconstructor m=new multiconstructor();
		multiconstructor m1=new multiconstructor(2);
		multiconstructor m2=new multiconstructor(2,3);
		multiconstructor m3=new multiconstructor(2,3,4);
		//multiconstructor m4=new multiconstructor("mozilla");
		
		

	}

}
