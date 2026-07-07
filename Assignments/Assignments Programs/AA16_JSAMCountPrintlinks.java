package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA16_JSAMCountPrintlinks {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		List<WebElement> login = driver.findElements(By.tagName("input"));
		int count = login.size();
		System.out.println("Total number of <input> tags:-> "+count);
		for(int i=0; i<count; i++)
			{
			System.out.println(login.get(i).getAttribute("type"));
			}
		//driver.quit();
		}

}
	