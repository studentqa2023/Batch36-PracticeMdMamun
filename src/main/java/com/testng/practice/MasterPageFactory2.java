package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory2 {
	public MasterPageFactory2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "(//a[contains(text(), 'Services')])[1]")
	private WebElement getservices;

	public WebElement getGetservices() {
		return getservices;
	}
		
	

}
