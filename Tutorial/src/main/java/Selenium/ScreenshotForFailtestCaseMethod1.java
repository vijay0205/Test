package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotForFailtestCaseMethod1 {
	public static WebDriver driver;
	public static String localSystemPath = System.getProperty("user.dir");
	public static String targetFolder = localSystemPath + "\\src\\test\\resources\\Screenshot1.jpg";

	@Test
	public static void captureScreenMethod() throws Exception {	
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		try {
			driver.get("https://www.softwaretestingmaterial.com");
			driver.navigate().refresh();

			driver.findElement(By.xpath("//*[@id='csqwe']")).sendKeys("agile"); // Statement with incorrect Xpath
		} catch (Exception e) {
			File targetFolderPath = new File(targetFolder);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, targetFolderPath);
		}
		driver.close();
		driver.quit();
	}
}
