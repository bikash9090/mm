package com.mm.testcases;

import org.testng.annotations.Test;

public class TC001_LoginTest extends TestBase {
	

	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		loginObj.enterUname(uname);
		loginObj.enterPwd(pwd);
		loginObj.clikLogin();
		Thread.sleep(3000);
	}
	
	@Test(priority = 1)
	public void loginTest2() throws InterruptedException {
		loginObj.clickForgotPassword();
		Thread.sleep(3000);
	}

}
