package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ManyTestTogether 
{
	@Test(invocationCount=10)
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
	}
}
