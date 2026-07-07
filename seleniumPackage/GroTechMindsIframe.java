package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindsIframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=	driver.findElement(By.id("chat-bot-launcher-button"));
		e1.click();
		
		WebElement iframe=	driver.findElement(By.id("chat-bot-iframe"));
		
		driver.switchTo().frame(iframe);//this is the way you can move the control from parent window to iframe
		Thread.sleep(7000);

		WebElement e2=	driver.findElement(By.xpath("//textarea[@id='textInput']"));
		e2.sendKeys("Rahul"+Keys.ENTER);
		
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);

		
		WebElement e3=	driver.findElement(By.xpath("//button[text()='Apply Now']"));
			e3.click();
	}
}
