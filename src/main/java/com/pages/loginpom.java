package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	
	@FindBy (how=How.XPATH,using ="//option[text()='21']")
	private WebElement age;
	
	@FindBy (how=How.XPATH,using = "(//option[text()='Male'])[1]")
	private WebElement gender;
	
	@FindBy (how=How.XPATH, using = "//option[text()='Buy a Term Plan']")
	private WebElement plan;
	
	@FindBy (how=How.XPATH, using = "//a[text()='Get Started!']")
	private WebElement getStarted;
	
	@FindBy (how=How.XPATH,using ="(//button[@type='button'])[16]")
	private WebElement dismiss_btn;
	
	
	
	//=========================================================================//
	// GETTER METHOD 
	public WebElement getage() {
		return age;
	}
	
	public WebElement getgender() {
		return gender;
	}
	
	public WebElement getplan() {
		return plan;
	}
	
	public WebElement getgetStarted () {
		return getStarted;
	}
	
	public WebElement getdismiss_btn () {
		return dismiss_btn;
	}
	
	
}
