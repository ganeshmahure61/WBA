package com.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	public static Logger log;
	
	@BeforeSuite 
	public void BS() throws Exception {
		config = new ConfigDataProvider();
		 excel= new ExcelDataProvider();
	}
	
//	@Parameters ("BrowserName")
	
	@BeforeMethod
	public void SetUp () {
	//	if(BrowserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	//	}
	
		
		
		 driver.get(config.getBaseUrl());
		 driver.manage().window().maximize();  
		 log = LogManager.getLogger("WBA");
	}
	
	@AfterMethod
	public void tearDown () {	
	//	driver.quit();
	}

}
