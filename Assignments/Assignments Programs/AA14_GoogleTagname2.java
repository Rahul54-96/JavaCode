package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA14_GoogleTagname2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		List<WebElement> login = driver.findElements(By.tagName("a"));
		System.out.println("Second link text :> "+login.get(1).getText());
		System.out.println("Total no of links present this page :-> "+login.size());
		System.out.println("below are the links :-> \n");
		for(WebElement linkname : login)
		{
			System.out.println(linkname.getText());
		}
		
		}

}
	