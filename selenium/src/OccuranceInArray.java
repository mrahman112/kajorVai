import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OccuranceInArray {
	
	static WebDriver driver;
	
	public OccuranceInArray(){
		
		
		
	}

	public static void main(String[] args)  {

	/*	driver=new FirefoxDriver();
		driver.get("http://yahoomail.com");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id='hotspot_main']/a/img")).click();
		Set<String> s=driver.getWindowHandles();
		System.out.println(s.size());
		Iterator<String>it=s.iterator();
		String mainwin=it.next();
		String second=it.next();
		
		
		*/
		int[]a={2,3,4,5,5,2};
		int tem=0;
		for(int i=0;i<a.length;i++){
			int count=0;
			if(a[i]==tem){
				continue;
			}
			else{
				for(int j=0;j<a.length;j++){
					if(a[i]==a[j]){
						++count;
						tem=a[i];
					}
				}
			}
			
			System.out.println(a[i]+" is present "+count+" times");
		}
	}
}
		