package InteractingWithWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementExamples {

	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
	WebDriver driver;

	@BeforeSuite
	public void startChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // Maximize the screen
	}

	@BeforeClass
	public void openUrl() {
		driver.get(url);
	}

	@Test(priority =0)
	public void sendKeys() throws InterruptedException {
		WebElement xpathLocator = driver.findElement(By.xpath("//input[@id='name']"));
		xpathLocator.sendKeys("Zafrin Chowdhury");
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void clear() throws InterruptedException {
		WebElement xpathLocator = driver.findElement(By.xpath("//input[@id='name']"));
		xpathLocator.sendKeys("Zafrin Chowdhury");
		Thread.sleep(5000);
		xpathLocator.clear();
		Thread.sleep(3000);
		xpathLocator.sendKeys("Zafrin Chowdhury");
		Thread.sleep(5000);
		
	}
	@Test(priority=2)
	public void click() throws InterruptedException {
		WebElement xpathLocator = driver.findElement(By.xpath("//label[contains(text(),'Gender:')]"));
		xpathLocator.click();
		Thread.sleep(5000);

		
	}
	@Test(priority=3)
	public void getAttribute() throws InterruptedException {
		WebElement xpathLocator = driver.findElement(By.xpath("//input[@id='mobile']"));
		System.out.println(xpathLocator.getAttribute("placeholder"));
		Thread.sleep(5000);

		
	}

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}

}

