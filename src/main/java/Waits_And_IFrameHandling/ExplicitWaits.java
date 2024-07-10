package Waits_And_IFrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {
	String url = "https://www.tutorialspoint.com/selenium/practice/register.php";
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
    public void explicitWaits() throws InterruptedException
    {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		WebElement first_name = driver.findElement(By.id("firstname"));
		first_name.sendKeys("Zafrin");
		Thread.sleep(5000);
    }

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}