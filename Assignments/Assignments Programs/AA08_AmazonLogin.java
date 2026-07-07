package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA08_AmazonLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
		login.sendKeys("abcdefg@gmail.com");
		Thread.sleep(3000);
		login = driver.findElement(By.className("a-button-input"));
		login.click();
		login = driver.findElement(By.name("password"));
		login.sendKeys("Password54", Keys.ENTER);
		Thread.sleep(5000);
		login = driver.findElement(By.xpath("(//div[@class = 'a-alert-content'])[1]"));
		System.out.println(login.getText());
	}

}
	