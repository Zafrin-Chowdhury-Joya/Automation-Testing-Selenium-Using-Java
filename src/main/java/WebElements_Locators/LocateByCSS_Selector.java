package WebElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocateByCSS_Selector {
		String url = "https://www.daraz.com.bd/";
		WebDriver driver;

		@BeforeSuite
		public void startChromeBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // Maximize the screen
		}

		@BeforeClass
		public void openUrl() {
			driver.get(url);
		}

		@Test
		public void locateByCSSSelector() throws InterruptedException {
			WebElement cssSelector = driver.findElement(By.cssSelector("a.grey.bld-txt.overlay"));
			cssSelector.click();
			Thread.sleep(5000);
		}

		@AfterSuite
		public void closeChromeBrowser() 
		{
			driver.quit();
		}

	}

