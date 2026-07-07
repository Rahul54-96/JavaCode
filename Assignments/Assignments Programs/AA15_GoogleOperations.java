package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA15_GoogleOperations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		List<WebElement> login = driver.findElements(By.tagName("a"));
		int count = login.size();
		System.out.println("Below are the links tag a :->");
		for(int i=0; i<count; i++)
		{
			WebElement e2= login.get(i); 
			String text= e2.getText(); 
			System.out.println(text); 
		}
		System.out.println("Total number of links :-> "+count);
		for(WebElement hreflinks : login)
		{
			System.out.println("href links :-> "+ hreflinks.getAttribute("href"));
		}
		
	}

}
	