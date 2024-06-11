package Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxBrowserInSelenium {

		  protected static String url = "https://www.postman.com/";
		   
		  WebDriver driver;
		  
		  @BeforeSuite
		  public void startFireFoxBrowser()

		  {
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();
		  }
		  
		  @Test
		  public void OpenUrl() throws InterruptedException
		  {
			  driver.get(url);
			  Thread.sleep(400);
		  }
		  
		  @AfterSuite
		  public void closeFireFoxBrowser()
		  {
			  driver.quit();
		  }
	}

