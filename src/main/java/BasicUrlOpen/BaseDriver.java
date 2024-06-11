package BasicUrlOpen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {
	 
	public WebDriver driver;
    
	
	@BeforeSuite // If i use this annotation before any method then this method is run at first of anything.
	public void startBrowserSetup()
	{
		String browserName= System.getProperty("browser","chrome");
		
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
	
	@AfterSuite // If i use this annotation before any method then this method is run at last of everything.
	public void closeBrowser()
	{
		driver.close();
	
	}
}
