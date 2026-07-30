package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PriorityTestCases 
{
	@Test(priority=1,invocationCount=10)
	public void login() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
	}
	@Test
	public void logout() throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.quit();
	}
	
}
