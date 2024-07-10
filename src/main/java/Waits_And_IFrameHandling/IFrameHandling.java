package Waits_And_IFrameHandling;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandling {
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
	 public void countFrame()
	 {
		List<org.openqa.selenium.WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
	 }
	@Test(priority =1)
   public void switchToFrame() throws InterruptedException
   {
	   driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
	   driver.switchTo().frame("frame1");
	   org.openqa.selenium.WebElement text = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]"));
	   System.out.print(text.getText());
	   Thread.sleep(5000);
	   driver.switchTo().defaultContent();
	   
	   WebElement button = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/button[1]"));
	   button.click();
	   Thread.sleep(5000);
   }

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}