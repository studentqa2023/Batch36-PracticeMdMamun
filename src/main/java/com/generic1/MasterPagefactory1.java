package com.generic1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPagefactory1 {
	public MasterPagefactory1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getLoginbtn1() {
		return loginbtn1;
	}

	@FindBy(xpath = "//*[contains(text(),'Signup / Login')]")
	private WebElement loginbtn1;
		
	@FindBy(xpath = "(//*[@name='email'])[1]")
	private WebElement emailfield;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//*[@class='btn btn-default'])[1]")
	private WebElement loginbtn2;
	
	@FindBy(xpath = "//*[contains(text(), 'Logout')]")
	private WebElement logoutbtn;
	
	//costco
	@FindBy(xpath = "(//a[contains(text(), 'Services')])[1]")
	private WebElement services;
	
	//Drag and Drop
	@FindBy(xpath = "//div[contains(text(), 'Norway')]")
	private WebElement dropNorway;
	
	public WebElement getDropNorway() {
		return dropNorway;
	}

	public WebElement getDragoslo() {
		return dragoslo;
	}

	@FindBy(xpath = "(//div[contains(text(), 'Oslo')])[2]")
	private WebElement dragoslo;
	
	//Drag & drop=>rome italy
	
	@FindBy(xpath = "//div[contains(text(), 'Rome') and @id='box6']")
	private WebElement dragrome;
	
	public WebElement getDragrome() {
		return dragrome;
	}

	public WebElement getDropitaly() {
		return dropitaly;
	}

	@FindBy(xpath = "//div[contains(text(), 'Italy')]")
    private WebElement dropitaly;
	
	@FindBy(xpath = "(//div[contains(text(), 'Washington')])[2]")
	private WebElement dragwashington;
	
	@FindBy(xpath = "//div[contains(text(), 'United States')]")
	private WebElement dropusa;
	
	public WebElement getDragwashington() {
		return dragwashington;
	}

	public WebElement getDropusa() {
		return dropusa;
	}
	@FindBy(xpath = "(//div[contains(text(), 'Seoul')])[2]")
	private WebElement dragseoul;
	
	@FindBy(xpath = "//div[contains(text(), 'South Korea')]")
	private WebElement dropsouthkorea;

	public WebElement getDragseoul() {
		return dragseoul;
	}

	public WebElement getDropsouthkorea() {
		return dropsouthkorea;
	}
	
	@FindBy(xpath = "(//div[contains(text(), 'Madrid')])[2]")
	private WebElement dragmadrid;
	
	@FindBy(xpath = "//div[contains(text(), 'Spain')]")
	private WebElement dropspain;

	public WebElement getDragmadrid() {
		return dragmadrid;
	}
	//Zoopla url 
	
	@FindBy(xpath = "//span[contains(text(), 'Accept all cookies')]")
	private List<WebElement> Acceptallcoockies;
	
	@FindBy(xpath = "(//span[contains(text(), 'Sign in')])[2]")
	private WebElement zooplalogin;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfield2;
	
	@FindBy(xpath = "//input[@id='current-password']")
	private WebElement passwordfield2;
	
	@FindBy(xpath = "//button[@class='_1erwn750 1erwn751 1erwn752 1erwn75a 1dgm2fc8']")
	private WebElement loginbtn3;
	
	
	@FindBy(xpath = "//div[contains(text(), 'Stockholm') and @id=\"box2\"]")
	private WebElement stockholm;
	
	public WebElement getStockholm() {
		return stockholm;
	}

	public WebElement getSweden() {
		return sweden;
	}

	@FindBy(xpath = "//div[contains(text(), 'Sweden')]")
	private WebElement sweden;
	
	public WebElement getZooplalogin() {
		return zooplalogin;
	}

	public WebElement getEmailfield2() {
		return emailfield2;
	}

	public WebElement getPasswordfield2() {
		return passwordfield2;
	}

	public WebElement getLoginbtn3() {
		return loginbtn3;
	}

	public List<WebElement> getAcceptallcoockies() {
		return Acceptallcoockies;
	}

	public WebElement getDropspain() {
		return dropspain;
	}

	public WebElement getServices() {
		return services;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getLoginbtn2() {
		return loginbtn2;
	}
	
	
	
	
	
	
	
	

	
	


}
