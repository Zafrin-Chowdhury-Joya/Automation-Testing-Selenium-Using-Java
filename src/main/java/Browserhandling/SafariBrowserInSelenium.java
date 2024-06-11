package Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariBrowserInSelenium {
	
	protected static String url = "https://www.postman.com/";
	
	WebDriver driver;
	
	@BeforeSuite
	public void startSafariBrowser()
	{
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void OpenUrl() throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@AfterSuite
	public void closeSafariBrowser()
	{
		driver.quit();
	}

}
