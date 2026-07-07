package pharmeasy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PharmeasyTest {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//button[@aria-label=\"Search\"]"));
		e1.click();
		Thread.sleep(3000);

		WebElement e2=driver.findElement(By.xpath("//input[@placeholder=\"Search medicines/Healthcare products\"]"));
		e2.sendKeys("PCM");
		Thread.sleep(3000);
		
List<WebElement> e3=driver.findElements(By.xpath("//div[@class=\"typeahead-lib-Typeahead-module_result__tF-Yj\"]"));
int count=e3.size();
System.out.println(count);

e3.get(count-7).click();		
Thread.sleep(3000);

WebElement e4=driver.findElement(By.id("proceed"));
e4.click();
Thread.sleep(3000);

Select s1=new Select(e4);

for(WebElement e5:s1.getOptions())
{
	if(e5.getText()=="2")
		e5.click();
	
}









		
		
		
		
	}

}
