package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA09_GoogleLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.linkText("About"));
		System.out.println(login.getText());
		login = driver.findElement(By.linkText("Store"));
		System.out.println(login.getText());
		login = driver.findElement(By.linkText("Gmail"));
		System.out.println(login.getText());
		login = driver.findElement(By.linkText("Images"));
		System.out.println(login.getText());
		login.click();
		Thread.sleep(3000);
		driver.close();
		}

}
	