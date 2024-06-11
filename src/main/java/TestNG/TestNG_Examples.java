package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Examples 
{
	@BeforeSuite
	public void beforeSuiteExample()
	{
		System.out.println("Before Suite.........");
	}
	@BeforeTest
	public void BeforeTestExample()
	{
		System.out.println("Before Test...........");
	}

	@BeforeClass
	public void BeforeClassExample()
	{
		System.out.println("Before Class................");
	}
	@BeforeMethod
	public void BeforeMethodExample()
	{
		System.out.println("Before Method...........");
	}
	@Test(priority = 1)
	public void TestExample()
	{
		System.out.println("Test Example 1................");
	}
	@Test(priority = 0)
	public void TestExample2()
	{
		System.out.println("Test Example 2................");
	}
	@AfterMethod
	public void AfterMethodExample()
	{
		System.out.println("After Method...........");
	}
	@AfterClass
	public void AfterClassExample()
	{
		System.out.println("After Class................");
	}
	@AfterTest
	public void afterTestExample()
	{
		System.out.println("After Test...........");
	}
	
	@AfterSuite
	public void afterSuiteExample()
	{
		System.out.println("After Suite...........");
	}

}
