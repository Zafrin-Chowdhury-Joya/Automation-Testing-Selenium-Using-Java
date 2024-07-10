package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertEqualsSoftAssertions {
	String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
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
	public void testAssertEquals() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium Practice - Student Registration Form";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        System.out.println("Title = " +actualTitle);
        softAssert.assertAll();
    }

	@AfterSuite
	public void closeChromeBrowser() {
		driver.quit();
	}
}