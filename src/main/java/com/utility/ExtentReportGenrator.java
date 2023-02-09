package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		// FOR Document Title , Name & Theme
		String reportpath = "C:\\Users\\PM\\eclipse-workspace\\WBA\\Reports";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportpath);
		
		reporter.config().setDocumentTitle("AUTOMATION REPORTS");
		reporter.config().setReportName("WBA HEALTH CARE");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("PROJECT_NAME","WBA Health Care");
		extent.setSystemInfo("MODULE", "Automation Test Module");
		extent.setSystemInfo("TOOL", "Selenium");
		extent.setSystemInfo("QA_Name", "Ganesh_Mahure");
		return extent;
		
		
		
		
	}

}
