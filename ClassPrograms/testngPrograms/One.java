package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class One 
{
	@Test
	public static void loginCode() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement e1= 	driver.findElement(By.xpath("//span[text()='Fresh']"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
	}
}
