package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonSearch2 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	    Date d1=new Date();
        System.out.println(d1.getTime());
        
        Date d2=new Date(d1.getTime());
        System.out.println(d2);
        String dateformat1=        d2.toString();
        String date=        dateformat1.substring(8, 10);
        String month=dateformat1.substring(4, 7);
        String year=dateformat1.substring(dateformat1.length()-4);
        String hour=dateformat1.substring(11,13);
        String min=dateformat1.substring(14,16);
        String second=dateformat1.substring(17,19);        
/*        System.out.println("MOnth->"+month );
        System.out.println("Year->"+year );
        System.out.println("Date->"+date);
        System.out.println("Hour->"+hour );
        System.out.println("Minute->"+min );
        System.out.println("Second->"+second );
*/
        //DD/MM/YYYY
        //DD-MM-YYYY
        
        String format1=        date.concat(month).concat(year).concat(hour).concat(min);
        System.out.println(format1);
      	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys"+Keys.ENTER);
		
		
        TakesScreenshot ts=      driver;
   File   source=  ts.getScreenshotAs(OutputType.FILE);	
   File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+format1+".png");

//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+new AmazonSearch2().getClass()+".png");
//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+Math.random()+".png");
   
FileHandler.copy(source,destination);				
	//	e1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
