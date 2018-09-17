package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotMethod1 {
	public static WebDriver driver;
	public static String localSystemPath = System.getProperty("user.dir");
	public static String targetFolder = localSystemPath +"\\src\\test\\resources\\Screenshot.jpg";
	
	public static void main(String[] args) throws IOException, InterruptedException {

		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=opOtP6Qe7fQ");
		/*
		 * TakesScreenshot screenshot =((TakesScreenshot)driver); File
		 * sourceFile=screenshot.getScreehotAs(OutputType.FILE);
		 */
		File targetFolderPath = new File(targetFolder);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, targetFolderPath);
		/*
		 * Selenium package also provides the function to copy file using FileHandler
		 * File handler comes from openqa.selenium package on the other hand FileUtils
		 * comes from apache.common.io
		 */
		// FileHandler.copy(screenshot, targetFolderPath);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		driver.quit();

	}
}