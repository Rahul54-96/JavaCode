package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA17_JSAMAbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.xpath("//body/form/input[@name=\"fname\"]"));
		login.sendKeys("Rahul");
		//driver.quit();
		}

}
	