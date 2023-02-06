package com.mm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "LoginName")
	private WebElement uname;

	@FindBy(name = "Password")
	private WebElement pwd;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	private WebElement login;

	@FindBy(linkText = "Forgot Password")
	private WebElement forgotpwd;

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	private WebElement signup;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUname(String username) {
		uname.sendKeys(username);
	}

	public void enterPwd(String passwrod) {
		pwd.sendKeys(passwrod);
	}

	public HomePage clikLogin() {
		login.click();
		return new HomePage(driver);
	}

	public void clickForgotPassword() {
		forgotpwd.click();
	}

	public void clickSignUp() {

	}

	public void getLoginTitle() {

	}
}
