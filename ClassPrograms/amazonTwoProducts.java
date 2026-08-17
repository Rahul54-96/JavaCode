package august172026Exam;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonTwoProducts
{
	private WebDriver driver;
	@BeforeMethod
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void Amazon() throws InterruptedException
    {
    	driver.get("https://www.amazon.in/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        WebElement firstProduct = driver.findElement(By.id("nav-search-submit-button"));
        firstProduct.click();
        WebElement firstProductCart =driver.findElement(By.xpath("//input[@class='a-button-input']"));
        firstProductCart.click();
        Thread.sleep(4000);
        WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox2.clear();
        searchBox2.sendKeys("Airpod");
        WebElement secondProduct = driver.findElement(By.id("nav-search-submit-button"));
        secondProduct.click();
        WebElement secondProductCart =driver.findElement(By.xpath("//input[@class='a-button-input']"));
        secondProductCart.click();
        WebElement ClickOnCart =driver.findElement(By.xpath("//a[@class='a-button-text']"));
        ClickOnCart.click();
        Thread.sleep(4000);
        WebElement deleteOneProd =driver.findElement(By.xpath("//input[@value='Delete']"));
        deleteOneProd.click();
      
    }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
 }
