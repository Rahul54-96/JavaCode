package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocatorAmazon2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.partialLinkText("Customer"));
		e1.click();
		
	}
}
