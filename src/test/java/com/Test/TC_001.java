package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.loginPOM;
import com.utility.Base_Class;
import com.utility.Library;

public class TC_001  extends Base_Class {
	
	@Test
	public void Test_verify () {
		
		//HealthCare Project
		//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
		
		
		loginPOM login=PageFactory.initElements(driver, loginPOM.class);
		
		Library.Custom_SendKeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0), "EMAIL");
		Library.Custom_SendKeys(login.getTxt_pass(), excel.getStringData("Sheet1", 0, 1), "PASSWORD");
		Library.Custom_Click(login.getLogin_btn(),"LOGIN BUTTON");
		
		
		//For get screen shot in report of test case
		
	//	Assert.assertTrue(false);
	}	
}
