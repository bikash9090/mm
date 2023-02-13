package com.mm.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mm.testcases.TestBase;

public class HomePage extends TestBase {

	@FindBy(css = "a.text-oneline")
	WebElement profileLink;

	@FindBy(xpath = "//mat-icon[contains(text(),'menu')]")
	WebElement menuBtn;

	@FindBy(xpath = "//input[@placeholder=\"Search Meetings(e.g. MM/DD/YYYY)\"]")
	WebElement searchBar;

	@FindBy(xpath = "//mat-icon[contains(text(),'search')]")
	WebElement searchBtn;

	@FindBy(xpath = "//mat-icon[contains(text(),'exit_to_app')]")
	WebElement logoutBtn;

	@FindBy(xpath = "//span[contains(text(),'Poll')]")
	WebElement pollBtn;

	@FindBy(xpath = "//b[contains(text(),'Create Poll')]")
	WebElement createPollBtn;

	@FindBy(xpath = "//b[contains(text(),'Response Poll')]")
	WebElement responsePollBtn;

	@FindBy(xpath = "//span[contains(text(),'Meeting')]")
	WebElement meetingBtn;

	@FindBy(xpath = "//b[contains(text(),'Create Instant Meeting')]")
	WebElement createInstantMeetingBtn;

	@FindBy(xpath = "//b[contains(text(),'Create Meeting')]")
	WebElement creaMeetingBtn;

	@FindBy(xpath = "//div[contains(text(),'Dashboard')]")
	WebElement dashboard;

	@FindBy(xpath = "//div[contains(text(),'Meeting Summary ')]")
	WebElement meetingSummary;

	@FindBy(xpath = "//div[contains(text(),'Instant Meeting ')]")
	WebElement instantMeeting;

	@FindBy(xpath = "//div[contains(text(),'Agenda Items')]")
	WebElement agendaItem;

	@FindBy(xpath = "//div[@class=\"mat-list-item-content\" and contains(text(),'Decision List') ]")
	WebElement decisionList;

	@FindBy(xpath = "//div[contains(text(),'Analysis')]")
	WebElement analysis;

	@FindBy(xpath = "//div[contains(text(),'Action Items')]")
	WebElement actionItemsBtn;

	@FindBy(xpath = "//*[@id=\"mat-tab-label-0-1\"]/div")
	WebElement dcisionListBtn;

	@FindBy(xpath = "//table/thead/tr/th")
	List<WebElement> actionItemsTh;

	@FindBy(xpath = "//table/tbody/tr/td")
	List<WebElement> actionItemsTd;

	@FindBy(xpath = "//table/thead/tr/th")
	List<WebElement> decisionListTh;

	@FindBy(xpath = "//table/tbody/tr/td")
	List<WebElement> decisionTh;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public HomePage clickDashboard() {
		dashboard.click();
		return this;
	}

	public MeetingSummary clickMeetingSummary() {
		meetingSummary.click();
		return new MeetingSummary();

	}

	public InstantMeeting clickInstantMeeting() {
		instantMeeting.click();
		if (driver.getCurrentUrl().equals(insUrl)) {
			return new InstantMeeting();
		} else {
			return null;
		}

	}

	public AgendaItems clickAgendaItems() {
		agendaItem.click();
		return new AgendaItems();
	}

	public DecisionList clickDecisionList() {
		decisionList.click();
		return new DecisionList();
	}

	public Analysis clickAnalysis() {
		analysis.click();
		return new Analysis();
	}

	public void clickMenu() {
		menuBtn.click();
	}

	public void clickSearchBar() {
		searchBar.click();
	}

	public void clickSearchBtn() {
		searchBtn.click();
	}

	public void clickLogoutBtn() {
		logoutBtn.click();
	}

	public void clickPollBtn() {
		pollBtn.click();
	}

	public void clickCreatePollBtn() {
		createPollBtn.click();
	}

	public void clickResponsePollBtn() {
		responsePollBtn.click();
	}

	public void clickMeetingBtn() {
		meetingBtn.click();
	}

	public void clickCreateInstantMeetingBtn() {
		createInstantMeetingBtn.click();
	}

	public void clickCreateMeetingBtn() {
		creaMeetingBtn.click();
	}

	public void clickActionItemsTab() {
		actionItemsBtn.click();
	}

	public void clickDecisionListTab() {
		dcisionListBtn.click();
	}

	public void clickProfile() {
		profileLink.click();
	}

	public void listActionItems() {

	}
}
