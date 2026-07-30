package testngPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonLoginWithManyInputs 
{
	@DataProvider()
	public Object loginData()
	{
		Object [][] d1=new Object[5][2];
		//1st row
		d1[0][0]="stbymkt@gmail.com";//valid email id
		d1[0][1]="manish1234";//valid pwd
		//2nd row

		d1[1][0]="8009900785";//valid mobile no
		d1[1][1]="manish1234";//valid pwd
		//3rd row

		d1[2][0]="stbymkt@gmail.com";//valid email id
		d1[2][1]="23456trfdef";//invalid password
		//4th row

		d1[3][0]="stbymktmanish@gmail.com";//invalud UN
		d1[3][1]="jhbgh87";//invalid PWD
		//5th  row
		d1[4][0]="";//NULL
		d1[4][1]="";//NULL
		return d1;


	}
	@Test(dataProvider="loginData")
	public void loginInputs(String UN,String PWD) throws InterruptedException
	{
		  ChromeDriver driver=new ChromeDriver();
          driver.get("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D809000348074%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11459057436911147790%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2459470%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
          
          Thread.sleep(3000);
          WebElement username=        driver.findElement(By.name("email"));
          username.sendKeys(UN);
  
          WebElement continuebutton=        driver.findElement(By.id("continue"));
          continuebutton.click();
  
          WebElement password=        driver.findElement(By.name("password"));
          password.sendKeys(PWD);
  
          
          WebElement signinbutton=        driver.findElement(By.id("signInSubmit"));
          signinbutton.click();
  
          
          
          Thread.sleep(3000);
          driver.quit();
          
	}
}
