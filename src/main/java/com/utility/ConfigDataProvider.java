package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro;
	
	public ConfigDataProvider () throws Exception {
		String filepath = "C:\\Users\\PM\\eclipse-workspace\\WBA\\Config\\config.properties";
		FileInputStream fis = new FileInputStream(filepath);
		
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
	
	public String getuserName () {
		return pro.getProperty("userName");
	}
	
	public String getpassword () {
		return pro.getProperty("password");
	}
	
	public String getsearch_job () {
		return pro.getProperty("search_job");
	}
	
	public String getenter_location () {
		return pro.getProperty("enter_location");
	}

	
	
}