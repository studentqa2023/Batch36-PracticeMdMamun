package com.generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserjava {
	WebDriver driver;
	public void crossbrowserLogin(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("Browser opend="+browser);
		}
		else {
			System.out.println("not found the browser");
		}
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.costco.com/");
		Actions ac = new Actions(driver);
		MasterPagefactory1 mpf1 = new MasterPagefactory1(driver);
		ac.moveToElement(mpf1.getServices()).perform();	
		}
		
		public static void main(String[] args) {
			CrossBrowserjava obj = new CrossBrowserjava ();
			obj.crossbrowserLogin("chrome");
			
		}
	}


