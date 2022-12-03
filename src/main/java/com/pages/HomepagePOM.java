package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomepagePOM {
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Search Facebook']")
	private WebElement search;
	
	public WebElement getsearch(WebElement webElement, String string) {
		return search;
		
	}
	
	
	

}
