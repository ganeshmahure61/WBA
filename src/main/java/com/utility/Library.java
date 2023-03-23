package com.utility;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
@Listeners(com.utility.Listner.class) 
public class Library extends Base_Class {
	
	public static ExtentTest test;
	
	public static void Custom_SendKeys(WebElement element, String value, String fieldName)
	{
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldName+"==Value Succesfully Send" + value);
			log.info("Value Succesfully Send " +fieldName );
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			log.error("Unable to send value " + fieldName);
		}
	}
	
	public static void Custom_Click(WebElement element, String fieldName) {
		try {
			element.click();
			test.log(Status.PASS,fieldName+ "==Click Succesfully");
			log.info("Click Succesfully " + fieldName);
		}catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			log.error("Unable to click "+fieldName);
		}
	}
	
	

}

