package Handling_Alerts_and_PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAlertWithPromtBox {
	protected static String url = "https://demoqa.com/alerts";
	   
	  WebDriver driver;
	  
	  @BeforeSuite
	  public void startBrowser()

	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  
	  @BeforeClass
	  public void OpenUrl() throws InterruptedException
	  {
		  driver.get(url);
		  Thread.sleep(400);
	  }
		@Test
		public void Simple_Alerts() throws InterruptedException 
		{

			
			WebElement first_alert = driver.findElement(By.xpath("//button[@id='promtButton']"));
			first_alert.click();
			Thread.sleep(3000);
			
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Zafrin Chowdhury");
			Thread.sleep(3000);
			alert.accept();
			Thread.sleep(3000);
			
		}
	  
	  @AfterSuite
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	


}
