package august172026Exam;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonShoesLowToHigh
{
	private WebDriver driver;

    @BeforeMethod
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/");
        
    }

    @Test
    public void Amazon()
    {
    	
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("shoes");
        driver.findElement(By.id("nav-search-submit-button")).click();
        WebElement sortbyfilter = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
        sortbyfilter.click();
        List<WebElement> filterVal = driver.findElements(By.xpath("//ul[@class='a-nostyle a-list-link']/li"));
        int count = filterVal.size();
        filterVal.get(count-5).click();
        

        List<WebElement> products = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        List<Double> prices = new ArrayList<>();
        for (WebElement product : products) {
            List<WebElement> priceElements = product.findElements(By.xpath(".//span[@class='a-price']//span[@class='a-offscreen']"));
            if (!priceElements.isEmpty()) {
                String priceText = priceElements.get(0).getText().trim();
                if (!priceText.isEmpty()) {
                    priceText = priceText.replaceAll("[^0-9.]", "");
                    if (!priceText.isEmpty()) {
                        double price = Double.parseDouble(priceText);
                        prices.add(price);
                        System.out.println("Product price: " + price);
                    }
                }
            }
        }
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
 }

