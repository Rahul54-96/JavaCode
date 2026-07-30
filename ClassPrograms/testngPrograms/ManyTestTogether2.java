package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ManyTestTogether2 
{
	@Test(timeOut=1000)//1 sec
	public void testcase1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
	}
}
