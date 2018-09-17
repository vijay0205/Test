package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class TakeScreenshotMethod2 {
	 public static WebDriver driver;
	 public static String  targetFolder="C:/Users/Mom's Blessing/eclipse-workspace/Tutorial/src/test/resources/Screenshot.png";
	

public static void main(String[] args) throws IOException, InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver",  "C:/Users/Mom's Blessing/eclipse-workspace/Tutorial/src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=opOtP6Qe7fQ");
		 File targetFolderPath= new File(targetFolder);
		EventFiringWebDriver eventFiring= new EventFiringWebDriver(driver);
		File screenshot= eventFiring.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, targetFolderPath);
		/*  Selenium package also provides the function to copy file using FileHandler
		 * File handler comes from openqa.selenium package on the other hand FileUtils comes from apache.common.io
		            */
//		FileHandler.copy(screenshot, targetFolderPath);
		Thread.sleep(2000);
	    driver.quit();
		
}}