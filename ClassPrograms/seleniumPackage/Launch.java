package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		
		String title=	driver.getTitle();
		System.out.println(title);
		
		
		String url=	driver.getCurrentUrl();
		System.out.println(url);
	}
}
