package com.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.loginpom;
import com.utility.Base_Class;
import com.utility.Library;
@Listeners(com.utility.Listner.class) 

public class TC_001  extends Base_Class {
	@Test
	public void Test_verify () throws Exception {	
		log.info("============================  Test Verify  ========================");
		
		loginpom login=PageFactory.initElements(driver, loginpom.class);
		
		Library.Custom_Click(login.getage(), "Click on Age");
		Library.Custom_Click(login.getgender(), "Click on Gender");
		Library.Custom_Click(login.getplan(), "Click on Plan");
		Library.Custom_Click(login.getplan(), "Click on Get Started !!");
		
		Alert alt = (Alert) driver.switchTo().frame(1);
		Library.Custom_Click(login.getdismiss_btn(), "Click on Dismiss");
		
	
	}	
}
