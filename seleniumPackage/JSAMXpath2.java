package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMXpath2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1= 	driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e1.click();
		WebElement link= 	driver.findElement(By.xpath("//a"));
		link.click();
	}
}
