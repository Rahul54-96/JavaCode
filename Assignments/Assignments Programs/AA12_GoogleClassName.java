package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA12_GoogleClassName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.className("gLFyf"));
		System.out.println(login.getText());
		login.sendKeys("$tsla",Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		}

}
	