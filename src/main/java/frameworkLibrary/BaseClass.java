package frameworkLibrary;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import applicationPages.BasePage;

public class BaseClass extends BasePage
{
	@BeforeSuite
	public void beforesuite()
	{
		CreateNewExtentReportInResultsFolderWithDateAndTimeStamp();
	}
	
	@BeforeMethod
	public void beforemethod(ITestContext testmethod)
	{
		int currentCount = testmethod.getAllTestMethods()[0].getCurrentInvocationCount() + 1;
		
		FrameworkVariables.getInstance().setCurrentTestCaseName(testmethod.getAllTestMethods()[0].getMethodName());
		FrameworkVariables.getInstance().setCurrentModuleName(testmethod.getAllTestMethods()[0].getTestClass().getRealClass().getSimpleName());
		FrameworkVariables.getInstance().setDataFilesPath(FrameworkVariables.getInstance().getCurrentFolderPath() + "\\DataFiles");
		FrameworkVariables.getInstance().setCurrentTestData();
		
		loadDataFromExceltoHashMap(currentCount);
		
		startExtentTestForCurrentTestCase(currentCount);
	}
	
	@AfterMethod
	public void aftermethod(ITestResult result,ITestContext testmethod)
	{
		int currentCount = testmethod.getAllTestMethods()[0].getCurrentInvocationCount();
		endExtentTestForCurrentTestCase();
		loadDataFromHashMaptoExcel(currentCount);
	}
	
	@AfterSuite
	public void aftersuite()
	{
		closeExtentReport();
		launchResult();
	}
}
