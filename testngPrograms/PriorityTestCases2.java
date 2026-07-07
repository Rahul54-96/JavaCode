package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PriorityTestCases2 
{
	@Test
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
	@Test(priority=-1)
	public void registration() throws InterruptedException
	{
		EdgeDriver driver=new EdgeDriver();
		driver.quit();
	}
}
