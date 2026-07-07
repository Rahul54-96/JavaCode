package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AA04_LaunchBrowserMaven {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.confirmtkt.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		FirefoxDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		System.out.println(driver1.getTitle());
		
		EdgeDriver driver2 = new EdgeDriver();
		driver2.get("https://www.skyscanner.co.in/");
		driver2.manage().window().maximize();
		System.out.println(driver2.getTitle());
	}

}
