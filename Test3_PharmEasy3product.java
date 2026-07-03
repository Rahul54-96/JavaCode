package classSession.JavaSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_PharmEasy3product 
{
        public static void main(String[] args) throws InterruptedException 
        {
                ChromeDriver driver=new ChromeDriver();
                System.out.println("\n=== Step 1: Launch https://pharmeasy.in/ ===");
                driver.get("https://pharmeasy.in/");
                driver.manage().window().maximize();
                Thread.sleep(3000);
                WebElement searchtab= driver.findElement(By.xpath("//div[@class='typeahead-lib-Typeahead-module_placeholderContent__8HePU']"));
                searchtab.click();
                System.out.println("\n=== Step 2: Search PCM ===");
                WebElement searchbox= driver.findElement(By.xpath("//input[@placeholder='Search medicines/Healthcare products']"));
                searchbox.sendKeys("PCM");
                Thread.sleep(3000);
                System.out.println("\n=== Step 3: Click on 3rd option ===");
                List<WebElement> resultList= driver.findElements(By.xpath("//div[@class='typeahead-lib-Typeahead-module_result__tF-Yj']"));
                int count=resultList.size();
                System.out.println("\n=== Step 4: From the list of search result click on 3rd product (selecting 4th product as 3rd product is out of stock)");
                resultList.get(count-7).click();
                Thread.sleep(3000);
               //WebElement blockButton = driver.findElement(By.xpath("//button[text()='Block']"));
               //blockButton.click();
                WebElement AddToCart = driver.findElement(By.xpath("(//button[@id='proceed'])[1]"));
                AddToCart.click();
                System.out.println("\n=== Step 5: Select the quantity as 2 ===");
                WebElement SelectQnt = driver.findElement(By.xpath("//div[@role='listbox']/child::div/span[text()='2']"));
                SelectQnt.click();
                Thread.sleep(3000);
                System.out.println("\n=== Step 6: Click on View cart ===");
                WebElement ViewCart = driver.findElement(By.xpath("//span[text()='View Cart']/ancestor::button[@id='proceed']"));
                ViewCart.click();
        }
} 
