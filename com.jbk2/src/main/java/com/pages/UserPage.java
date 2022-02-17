package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
public WebDriver updriver;



public UserPage(WebDriver driver) {
	
	updriver=driver;
	PageFactory.initElements(driver, this);
}

	
	
	
	
	
	
}
