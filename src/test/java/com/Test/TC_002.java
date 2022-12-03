package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.HomepagePOM;
import com.utility.Base_Class;

public class TC_002 extends Base_Class{
	
	
	@Test
	public void Test_verify  () {
		
		HomepagePOM home=PageFactory.initElements(driver , HomepagePOM.class);
		
		
		
				
	}
}
