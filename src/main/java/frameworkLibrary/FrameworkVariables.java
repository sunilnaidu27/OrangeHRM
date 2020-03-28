package frameworkLibrary;

import java.util.HashMap;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class FrameworkVariables
{
	private static FrameworkVariables instance;
	private String CurrentFolderPath;
	private String CurrentTestCaseName;
	private String CurrentModuleName;
	private String DataFilesPath;
	private  String CurrentResultPath;
	private  HashMap<String,String> CurrentTestData;
	private  ExtentReports report;
	private  ExtentTest test;
	private  Exception exceptiondescription;
	
	
	private FrameworkVariables()
	{
		
	}
	
	public static FrameworkVariables getInstance()  
	{ 
	    if (instance == null)  
	    { 
	      instance = new FrameworkVariables(); 
	    } 
	    return instance; 
	 } 
	
	 public HashMap<String,String> getCurrentTestData()
	 {
	  	return CurrentTestData;
	 }
	 
	 public void setCurrentTestData()
	 {
	  	CurrentTestData = new HashMap<String,String>();
	 }
	 
	 public String getCurrentFolderPath()
	 {
	  	return CurrentFolderPath;
	 }
	 
	 public void setCurrentFolderPath(String path)
	 {
	  	 CurrentFolderPath = path;
	 }
	 
	 public Exception getExceptionDescription()
	 {
	  	return exceptiondescription;
	 }
	 
	 public void setExceptionDescription(Exception e)
	 {
		 exceptiondescription = e;
	 }
	 
	 public String getCurrentTestCaseName()
	 {
	  	return CurrentTestCaseName;
	 }
	 
	 public void setCurrentTestCaseName(String path)
	 {
		 CurrentTestCaseName = path;
	 }
	 
	 public String getCurrentModuleName()
	 {
	  	return CurrentModuleName;
	 }
	 public void setCurrentModuleName(String path)
	 {
		 CurrentModuleName = path;
	 }
	 public String getDataFilesPath()
	 {
	  	return DataFilesPath;
	 }
	 public void setDataFilesPath(String path)
	 {
		 DataFilesPath = path;
	 }
	 public String getCurrentResultPath()
	 {
	  	return CurrentResultPath;
	 }
	 public void setCurrentResultPath(String path)
	 {
		 CurrentResultPath = path;
	 }
	 public ExtentReports getExtentReports()
	 {
	  	return report;
	 }
	 public void setExtentReports(ExtentReports tempExtentReport)
	 {
		 report = tempExtentReport;
	 }
	 public ExtentTest getExtentTest()
	 {
	  	return test;
	 }
	 public void setExtentTest(ExtentTest tempExtentTest)
	 {
		 test = tempExtentTest;
	 }
}
