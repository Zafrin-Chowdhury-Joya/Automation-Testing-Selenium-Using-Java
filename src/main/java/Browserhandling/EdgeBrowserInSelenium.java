package Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserInSelenium {

	protected static String url = "https://www.postman.com/";
	
	WebDriver driver;
	
	@BeforeSuite
	 public void startEdgeBrowser()
	 {
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.manage().window().fullscreen();
	 }
	 @Test
	public void OpelUrl() throws InterruptedException
	{
		driver.get(url);
		Thread.sleep(400000000);
	}
	 
	 @AfterSuite
	 public void closeEdgeBrowser()
	 {
		 driver.quit();
	 }
	
}
