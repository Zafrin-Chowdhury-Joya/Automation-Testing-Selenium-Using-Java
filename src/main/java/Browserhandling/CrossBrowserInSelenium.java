package Browserhandling;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CrossBrowserInSelenium {
		protected static String url = "https://www.postman.com/";
		String browserName= System.getProperty("browser","firefox");
		WebDriver driver;
		
		
		@BeforeSuite
		public void CrossBrowser()
		{
		if (browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
			
		else if  (browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
		}	
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		
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
