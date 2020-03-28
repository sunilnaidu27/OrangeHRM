package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import applicationPages.Pg101_Login;
import applicationPages.Pg102_Home;
import applicationPages.Pg103_ContactDetails;
import frameworkLibrary.BaseClass;

public class Module1 extends BaseClass {
	WebDriver driver;
	Pg101_Login loginpage;
	Pg102_Home homepage;
	Pg103_ContactDetails contactdetailspage;

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "BrowserServers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm");

		loginpage = new Pg101_Login(driver);
		homepage = new Pg102_Home(driver);

		loginpage.setUserName(getdata("UserName"));
		loginpage.setpassword(getdata("Password"));
		loginpage.ClickonLogin();
		homepage.clickOnMyInfo();
		homepage.clickOnContactDetails();
	}

	@Test(invocationCount=1)
	public void TC101() {
		contactdetailspage = new Pg103_ContactDetails(driver);
		contactdetailspage.clickOnEdit();
		contactdetailspage.setAddressStreet1(getdata("Address1"));
		contactdetailspage.setAddressStreet2("Madhapur");
		contactdetailspage.setCity("Hyderabad");
		contactdetailspage.setZipCode("500081");
		contactdetailspage.setCounty("India");
		contactdetailspage.setHomeTelephone("9632598745");
		contactdetailspage.setWorkTelephone("9635125896");
		contactdetailspage.setWorkEmail("abcd@gmail.com");
		contactdetailspage.setOtherEmail("pqrs@gmail.com");
		contactdetailspage.clickOnSave();
	}

	@AfterMethod
	public void after() {
		homepage.Logout();
		quitdriver(driver);
	}
}
