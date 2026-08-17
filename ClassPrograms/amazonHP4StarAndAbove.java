package august172026Exam;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonHP4StarAndAbove
{
	private WebDriver driver;
	private WebDriverWait wait;
   
    @BeforeMethod
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.amazon.in/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @Test
    public void Amazon()
    {
    	
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        By hpBrand = By.xpath("//li[@id='p_123/308445']/descendant::i");
        WebElement hpFilter = wait.until(ExpectedConditions.elementToBeClickable(hpBrand));
        hpFilter.click();
        By fourStars = By.xpath("//li[@id='p_72/1318476031']/descendant::i");
        WebElement ratingFilter = wait.until(ExpectedConditions.elementToBeClickable(fourStars));
        ratingFilter.click();
        List<WebElement> list =driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        if (list.isEmpty()) {
            throw new AssertionError("No search results found after applying filters.");
        }

        for (WebElement r : list) {
            String title = "";
            try {
                WebElement titleEl = r.findElement(By.cssSelector("h2 a span"));
                title = titleEl.getText();
            } catch (NoSuchElementException ignored) {
                continue;
            }
            if (!title.toLowerCase().contains("hp")) {
                throw new AssertionError("Found non-HP product: " + title);
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
