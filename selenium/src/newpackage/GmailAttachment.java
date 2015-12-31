package newpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class GmailAttachment {
    
    //@AfterSuite
    
    public static void main(String[] args) throws InterruptedException, IOException{
        
        //SendMail.reportSent();
        
        //HtmlUnitDriver dr=new HtmlUnitDriver();
        WebDriver dr=new FirefoxDriver();
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.get("http://gmail.com");
        dr.findElement(By.id("Email")).sendKeys("mizansapon");
        dr.findElement(By.id("Passwd")).sendKeys("Jarjees1");
        dr.findElement(By.id("signIn")).click();
        Thread.sleep(2000);
        dr.findElement(By.xpath("//*[@id=':bg']/div/div")).click();
        /*
        Set<String> win=dr.getWindowHandles();
        Iterator<String>it=win.iterator();
        String mainwin=it.next();
        String secondwin=it.next();
        dr.switchTo().window(secondwin);
        */
        Thread.sleep(3000);
        dr.findElement(By.name("to")).click();
        dr.findElement(By.name("to")).sendKeys("mdsapon@yahoo.com");
        dr.findElement(By.name("subjectbox")).sendKeys("test report");
        WebElement e=dr.findElement(By.xpath("//div[@class='a1 aaA aMZ']"));
        e.click();
        //dr.findElement(By.id(":so"))
       // e.sendKeys("/Users/mizansapon/Documents/workspace/ReadProperty/test-output/emailable-report.html");
        Runtime.getRuntime().exec("C:\\Users\\Humaira.Jarjees\\Documents\\ttt.exe");
        Thread.sleep(10000); //wait for 10sec to upload file
        dr.findElement(By.xpath("//*[@id=':qq']")).click();
    }


}
