package Action_And_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Select {
	protected static String url = "https://www.tutorialspoint.com/selenium/practice/register.php";
	   
	  WebDriver driver;
	  
	  public Select(WebElement selectState) {
		// TODO Auto-generated constructor stub
	}

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
       public void selectState ()
       {
			WebElement selectState = driver.findElement(By.id("state"));
			Select select = new Select (selectState);
			select.selectByIndex(2);
			
       }
	  
	  private void selectByIndex(int i) {
			// TODO Auto-generated method stub
			
		}

	@AfterSuite
	  public void closeBrowser()
	  {
		  driver.close();
	  }
	


}
