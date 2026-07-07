package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class AA05_LaunchGroTechMinds {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
	