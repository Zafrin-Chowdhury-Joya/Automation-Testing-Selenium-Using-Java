package WebElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasicUrlOpen.BaseDriver;

public class LocateByName extends BaseDriver {

	@BeforeClass
	public void OpenUrl()
	{
		driver.get("https://web.facebook.com/");
	}
	@Test
	public void Locate_By_Name() throws InterruptedException
	{
		WebElement email =driver.findElement(By.name("email"));
		email.sendKeys("test@gmail.com");
		Thread.sleep(50000);
	}

}
