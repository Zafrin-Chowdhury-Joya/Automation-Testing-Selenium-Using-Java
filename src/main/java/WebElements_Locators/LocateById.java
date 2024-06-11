package WebElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasicUrlOpen.BaseDriver;

public class LocateById extends BaseDriver {

	@BeforeClass
	public void OpenUrl()
	{
		driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void Locate_By_Id() throws InterruptedException
	{
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(50000);
	}
}
