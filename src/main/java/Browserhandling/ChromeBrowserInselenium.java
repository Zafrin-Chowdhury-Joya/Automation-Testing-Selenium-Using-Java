package Browserhandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class ChromeBrowserInselenium {
	  protected static String url = "https://www.postman.com/";
	   
	  WebDriver driver;
	  
	  @BeforeSuite
	  public void startBrowser()

	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @Test
	  public void OpenUrl() throws InterruptedException
	  {
		  driver.get(url);
		  Thread.sleep(400);
	  }
	  
	  @AfterSuite
	  public void closeBrowser()
	  {
		  driver.close();
	  }
}
