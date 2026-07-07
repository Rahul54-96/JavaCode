package testngPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest{
	@Test
	public void loginToAMazon_Cart() throws InterruptedException
	{
		WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		WebElement e2=	driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
		Thread.sleep(3000);
		
		List<WebElement>	list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		list.get(0).click();
		
		
		Set<String> s1=	driver.getWindowHandles();
			Iterator<String> pcid=			s1.iterator();
				String pid=				pcid.next();
				String cid=				pcid.next();
				driver.switchTo().window(cid);
				Thread.sleep(3000);

			WebElement addToCart=	driver.findElement(By.id("add-to-cart-button"));		
			addToCart.click();	}
}
