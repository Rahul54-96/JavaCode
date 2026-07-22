package testngPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLogic implements ITestListener
{
	public static	WebDriver driver;//Interface

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		 TakesScreenshot ts=      (TakesScreenshot) driver;
		   File   source=  ts.getScreenshotAs(OutputType.FILE);        
		   File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\Pass\\"+result.getName()+".png");

		//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+new AmazonSearch2().getClass()+".png");
		//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+Math.random()+".png");
		   
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                     
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		 TakesScreenshot ts=      (TakesScreenshot) driver;
		   File   source=  ts.getScreenshotAs(OutputType.FILE);        
		   File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\Fail\\"+result+".png");

		//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+new AmazonSearch2().getClass()+".png");
		//File destination=new File("E:\\MKTProject\\Automation Batch 67\\test-output\\Screenshot\\File"+Math.random()+".png");
		   
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                     

	}
	
}
