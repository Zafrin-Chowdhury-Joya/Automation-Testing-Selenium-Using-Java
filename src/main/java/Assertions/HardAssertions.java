package Assertions;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import BasicUrlOpen.BaseDriver;



public class HardAssertions extends BaseDriver{

	public WebDriver driver;
	 
	@BeforeClass
	public void OpenUrl() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		Thread.sleep(5000);
	}
	@Test
	public void hardAssertions()
    {
		String expectedTitle = "Selenium Practice - Register";
		String actualTitle = driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Title = " +actualTitle);
		
		
	}

}
