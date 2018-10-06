package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class ScreeshotUsingShutterbug {
	public static WebDriver driver;
	public static String localSystemPath = System.getProperty("user.dir");
	public static String targetFolder = localSystemPath +"\\src\\test\\resources\\ScreenshotUsingShutterbug.jpg";
	
	public static void main(String[] args) throws IOException, InterruptedException {

		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=opOtP6Qe7fQ");
		Shutterbug.shootPage(driver).save(); //It will create screenshotfolder and save the attachment
		
		/*Saving the attachment to specific path
		Shutterbug.shootPage(driver).save(targetFolder);
		------------------------------------------------------------------------------------------
Taking screenshot of entire page(scroll the page
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS).save();
			*/
		
	
		driver.quit();

	}
}