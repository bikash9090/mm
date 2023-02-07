package com.mm.testcases;

import org.testng.annotations.Test;

import com.mm.pageobjects.HomePage;
import com.mm.pageobjects.InstantMeeting;

public class TC002_HomePageTest extends TestBase {

	@Test()
	public void clikingTest() throws InterruptedException {
		HomePage HomeObj = new HomePage(driver);
		
		InstantMeeting insObj = HomeObj.clickInstantMeeting();
		Thread.sleep(5000);
		System.out.println(insObj.getTitle());
		
		

	}
}
