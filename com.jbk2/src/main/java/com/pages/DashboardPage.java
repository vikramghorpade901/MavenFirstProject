package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver dpdriver;

@FindBy(tagName="h1")
private WebElement header ;

@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a")
private WebElement userbtn ;

public DashboardPage(WebDriver driver) {
	this.dpdriver = driver;
	PageFactory.initElements(driver, this);
}

	public boolean verifyHeader() {
	return header.isDisplayed();
	}	
	
	public UserPage clickUser() {
		userbtn.click();
		return new UserPage(dpdriver);
		
	}
}
