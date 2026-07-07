package testngPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest
{
	@Test
	public void loginToAMazon() throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys");
		WebElement e2=	driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
		Thread.sleep(3000);
		
		List<WebElement>	list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		list.get(0).click();	}
}
