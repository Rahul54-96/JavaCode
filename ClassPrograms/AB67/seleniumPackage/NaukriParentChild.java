package seleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriParentChild 
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount");
		driver.manage().window().maximize();
		
		WebElement e1=	driver.findElement(By.xpath("//span[text()='Google']"));
		
		e1.click();
		Thread.sleep(2000);
		
		Set<String> pcid=	driver.getWindowHandles();
						
		Iterator<String>	i2=		pcid.iterator();
			String patentId=				i2.next();
			String childid=				i2.next();

		
		driver.switchTo().window(childid);
		Thread.sleep(4000);

		driver.close();	
		
		
	}
}
