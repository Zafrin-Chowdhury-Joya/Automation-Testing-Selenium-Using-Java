package BasicUrlOpen;

import org.testng.annotations.Test;

public class OpenUrl extends BaseDriver{
	
	@Test
	public void Open() throws InterruptedException
	{
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
	}

}
