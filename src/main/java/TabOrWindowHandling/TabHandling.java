package TabOrWindowHandling;



import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TabHandling {
	String url = "https://www.tutorialspoint.com/selenium/practice/frames.php";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the screen
	}

	@BeforeClass
	public void openUrl() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}

	@Test
	public void tab() throws InterruptedException 
	{
		String parentTab =driver.getWindowHandle();
		
		//Create a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		String childTab =driver.getWindowHandle();
		driver.get("https://chatgpt.com/");
		Thread.sleep(5000);
		
		//count the number of tabs
		Set<String> allTabs = driver.getWindowHandles();
		System.out.print("Number of Tabs = " +allTabs.size());
		//back to first tab
		driver.switchTo().window(parentTab);
		Thread.sleep(5000);
		//back to last tab
		driver.switchTo().window(childTab);
		Thread.sleep(5000);
	}


	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}