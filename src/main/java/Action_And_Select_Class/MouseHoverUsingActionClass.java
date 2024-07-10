package Action_And_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverUsingActionClass {
	protected static String url = "https://www.daraz.com.bd/";
	   
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
		 
	  }
		@Test
		public void MouseHover() throws InterruptedException 
		{

			Actions actions = new Actions(driver);
			WebElement tvAndHome = driver.findElement(By.xpath("//span[contains(text(),'TV & Home Appliances')]"));
			actions.moveToElement(tvAndHome).perform();
			Thread.sleep(3000);
			
			
			WebElement television = driver.findElement(By.xpath("//ul[@class='lzd-site-menu-root']/ul[7]/li[1]/a/span"));
			actions.moveToElement(television).perform();
			Thread.sleep(3000);
			
			WebElement oledTelevision = driver.findElement(By.xpath("//span[contains(text(),'OLED Televisions')]"));
			oledTelevision.click();
			Thread.sleep(3000);
		}
	  
	  @AfterSuite
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	


}
