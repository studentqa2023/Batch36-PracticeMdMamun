package com.generic1;

import org.openqa.selenium.WebDriver;

public class ZooplaPractice {
	WebDriver driver;
	
	public void getLogin() {
		
		DriverManager dm = new DriverManager();
		driver = dm.getDriver(driver);
		
		driver.navigate().to("https://www.zoopla.co.uk/");
		MasterPagefactory1 mpf1 = new MasterPagefactory1(driver);
		
		
		//click on accept allcookes
		if(mpf1.getAcceptallcoockies().size()>0) {
					
			mpf1.getAcceptallcoockies().get(0).click();
		}
			mpf1.getZooplalogin().click();
			mpf1.getEmailfield2().sendKeys("rezwanislam@rocketmail.com");
			mpf1.getPasswordfield2().sendKeys("Boston2023");	
			mpf1.getLoginbtn3().click()	;		
		}
		

		
	
	
	
public static void main(String[] args) {
	ZooplaPractice obj = new ZooplaPractice();
	obj.getLogin();
}
}
