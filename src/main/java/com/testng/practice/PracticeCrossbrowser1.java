package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeCrossbrowser1 {
	WebDriver driver;
	
	public void getcrossbrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("Browser opend="+browser);
		}
		else {
			System.out.println("Browser not opend");
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		Actions ac = new Actions(driver);
		MasterPageFactory2 mpf2 = new MasterPageFactory2(driver);
		ac.moveToElement(mpf2.getGetservices()).perform();
	}
	public static void main(String[] args) {
		PracticeCrossbrowser1 obj = new PracticeCrossbrowser1();
		obj.getcrossbrowser("Firefox");
	}

}
