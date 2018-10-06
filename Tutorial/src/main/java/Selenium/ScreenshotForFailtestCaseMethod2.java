package Selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotForFailtestCaseMethod2 {
	public static WebDriver driver;
	public static String localSystemPath = System.getProperty("user.dir");
	public static String targetFolder = localSystemPath + "\\src\\test\\resources\\Screenshot2.jpg";

	@Test
	public static void captureScreenMethod() throws Exception {
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='csqwe']")).sendKeys("agile"); 
	}

	@AfterMethod // AfterMethod annotation - This method executes after every test execution
	public void screenShot(ITestResult result) {
		// using ITestResult.FAILURE is equals to result.getStatus then it enter into if
		// condition
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				// To create reference of TakesScreenshot
				File targetFolderPath = new File(targetFolder);
				File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot, targetFolderPath);
				System.out.println("Successfully captured a screenshot");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		driver.quit();
	}
}
