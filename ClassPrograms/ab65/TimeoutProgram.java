package ab65;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutProgram 
{
	@Test(timeOut=1000)
	public void testcase()
	{
		ChromeDriver driver=new ChromeDriver();
	}
}
