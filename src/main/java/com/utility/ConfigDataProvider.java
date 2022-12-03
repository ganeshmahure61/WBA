package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	
	Properties pro;
	
	public ConfigDataProvider () throws Exception {
		String filepath = "C:\\Users\\GANESH MAHURE\\Desktop\\Eclipse\\WBA-US\\Health_Care\\Config\\config.properties";
		FileInputStream fis = new FileInputStream(filepath);
		
		pro = new Properties();
		pro.load(fis);
	}
	
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
	
}