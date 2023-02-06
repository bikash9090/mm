package com.mm.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mm.pageobjects.LoginPage;
import com.mm.util.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static protected WebDriver driver;
	protected ReadConfig rcObj = new ReadConfig();
	LoginPage loginObj;

	String url = rcObj.getUrl();
	String uname = rcObj.getUsername();
	String pwd = rcObj.getPassword();
	String br = rcObj.getBrowser();
	protected String  insUrl = rcObj.getInstantPageUrl();
	
	//@Parameters("Browser")
	@BeforeMethod()
	public void login() {
		
		if (br.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (br.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		loginObj = new LoginPage(driver);
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		loginObj.enterUname(uname);
		loginObj.enterPwd(pwd);
		loginObj.clikLogin();
	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
