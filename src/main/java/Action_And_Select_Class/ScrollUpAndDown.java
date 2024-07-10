package Action_And_Select_Class;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpAndDown {

	protected static String url = "https://www.tutorialspoint.com/selenium/practice/scroll-down.php";
	   
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
		@Test(priority=0)
		public void ScrollDown() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript ("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			
		}
		@Test(priority=1)
		public void ScrollUp() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			

			js.executeScript("window.scrollTo(0,0)");
			Thread.sleep(5000);
			
		}


		@Test(priority=2)
		public void SpecificLocation() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement whereCanIGetSome = driver.findElement(By.xpath("//h3[contains(text(),'Where can I get some?')]"));
			js.executeScript ("arguments[0].scrollIntoView(true);",whereCanIGetSome);
			Thread.sleep(5000);
			
		}

	  
	  @AfterSuite
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	


}
