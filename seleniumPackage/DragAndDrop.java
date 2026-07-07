package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement drag= 	driver.findElement(By.id("container-6"));
		WebElement drop= 	driver.findElement(By.id("div2"));

		Thread.sleep(2000);
		
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag,drop).perform();
		
	
	}
}
