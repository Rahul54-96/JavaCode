package ab65;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();			
		driver.get("https://www.Amazon.in");
		Thread.sleep(2000);
		
		WebElement dropdown=	driver.findElement(By.xpath("//select[@name='url']"));
		
		Select s1=new Select(dropdown);
		s1.selectByIndex(11);
		
}
}
