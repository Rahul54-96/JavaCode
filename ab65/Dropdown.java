package ab65;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Dropdown {
public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();			
		driver.get("https://www.google.com");
		List<WebElement> list=	driver.findElements(By.tagName("a"));
		
		int count=	list.size();
		System.out.println(count);
		String s1=	list.get(0).getText();
		System.out.println(s1);
		for(int i=0;i<count;i++)
		{
		WebElement e2=	list.get(i);
		String url=	e2.getDomAttribute("href");
		String text=			e2.getText();
		System.out.println(url);
		System.out.println(text);
		}	
}
}
