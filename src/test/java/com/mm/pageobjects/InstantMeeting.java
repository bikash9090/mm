package com.mm.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mm.testcases.TestBase;

public class InstantMeeting extends TestBase{

	@FindBy(xpath = "//a[contains(text(),'Instant Meetings')]")
	WebElement insPageTitle;
	
	public InstantMeeting() {
		PageFactory.initElements(driver,this);
	}
	
	public String getTitle() {
		return insPageTitle.getText();
	}
}
