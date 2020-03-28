package testScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import frameworkLibrary.BaseClass;

public class Module3 extends BaseClass
{
	@BeforeMethod
	public void beforetest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterMethod
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	@Test
	public void TC301()
	{
		System.out.println("Executing TC301");
	}
	
	@Test
	public void TC302()
	{
		System.out.println("Executing TC302");
	}
	
	@Test
	public void TC303()
	{
		System.out.println("Executing TC303");
	}
}
