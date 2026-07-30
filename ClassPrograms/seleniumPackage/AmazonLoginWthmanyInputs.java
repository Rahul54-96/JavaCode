package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLoginWthmanyInputs 
{
	@DataProvider()
	public Object inputs()
	{
		 Object [][] d1=new Object[5][1];	
		 d1[0][0]=	"shoe";
		 d1[1][0]=	"mobile";
		 d1[2][0]=	"laptop";
		 d1[3][0]	="mouse";
		 d1[4][0]=	"keyword";
		 return d1;
	}
	
	@Test(dataProvider="inputs")
	public void amazonSearch(String input) throws InterruptedException
	{
		
	 	ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			
			Thread.sleep(3000);
			WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys(input+Keys.ENTER);
			Thread.sleep(3000);
			driver.quit();
	}
}
