package com.generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CostcoPractice {
	public void getMoushover() {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.costco.com/");
	Actions ac = new Actions(driver);
	MasterPagefactory1 mpf1 = new MasterPagefactory1(driver);
	ac.moveToElement(mpf1.getServices()).perform();	
	}
 public static void main(String[] args) {
	CostcoPractice obj = new CostcoPractice();
	obj.getMoushover();
}
} 
