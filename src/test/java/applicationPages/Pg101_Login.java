package applicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pg101_Login extends BasePage
{
	BasePage basepage = new BasePage();
	
	//Initilization
	WebDriver driver;
	public Pg101_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//define webelementss
	@FindBy(how=How.XPATH,using="//input[@name='txtUsername']")
	WebElement Username;
	
	@FindBy(how=How.XPATH,using="//input[@name='txtPassword']")
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@name='Submit']")
	WebElement Singin;
	
	
	//related methods to perform operation on webelements
	boolean stepstatus;
	public void setUserName(String Strusername)
	{
		stepstatus = basepage.setText(Username, Strusername);
		reportEvent(stepstatus, "Able to enter username", "Unable to enter username",driver);
	}
	public void setpassword(String Strpassword)
	{
		stepstatus = basepage.setText(Password, Strpassword);
		reportEvent(stepstatus, "Able to enter password", "Unable to enter password",driver);
	}
	
	public void ClickonLogin()
	{
		stepstatus = basepage.clickElement(Singin);
		reportEvent(stepstatus, "Able to click on Sign-In BUtton", "Unable to click on Sign-In Button",driver,true);
	}
}
