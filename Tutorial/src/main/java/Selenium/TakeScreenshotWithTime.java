package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakeScreenshotWithTime {
	 public static WebDriver driver;
	 public static String localSystemPath = System.getProperty("user.dir");
		public static String targetFolder = localSystemPath +"\\src\\test\\resources\\";
public static void main(String[] args) throws IOException, InterruptedException {

	String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=opOtP6Qe7fQ");
		SimpleDateFormat formatter= new SimpleDateFormat("ddmmyyyyHHmmss");
		Date date=new Date();
		 String screenshotNamewithTime= targetFolder+"screenshot"+formatter.format(date)+".png"; 
//		 String folder=targetFolder.concat(screenshotNamewithTime) + ".png";
		 System.out.println("@@@@@@@@@@@@@@@@" +screenshotNamewithTime);
		 File targetFolderPath= new File(screenshotNamewithTime);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, targetFolderPath);
	    driver.quit();
		
}}