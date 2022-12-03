package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner extends Base_Class implements ITestListener{
	
	ExtentReports extent= ExtentReportGenrator.getReports();
	ThreadLocal<ExtentTest> extentTest= new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extentTest.set(Library.test);
	}

	
	
	public void onTestSuccess(ITestResult result) {	
		extentTest.get().log(Status.PASS, "Test case Pass");
	}

	public void onTestFailure(ITestResult result) {
		extentTest.get().log(Status.FAIL, "Test Case Fail");
		Library.test.addScreenCaptureFromBase64String(getcapture());
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Test Case Skipped");
	}

	public void onFinish(ITestContext context) {
		extent.flush();	
	}
	
	
	// Screen shot 
	public static String getcapture () {
		TakesScreenshot ts= (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
	
	
	

}
