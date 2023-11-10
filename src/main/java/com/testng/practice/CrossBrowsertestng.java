package com.testng.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowsertestng {
	WebDriver driver;
	
	public void crossbrowserlogin(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			
			System.out.println("Browser opend="+browser);
		}
		else{
			System.out.println("Browser will not open");
		}
			
		driver.manage().window().maximize();
		driver.navigate().to("https://www.costco.com/");
		Actions ac = new Actions(driver);
		MasterPageFactory2 mpf = new MasterPageFactory2(driver);
		ac.moveToElement(mpf.getGetservices()).perform();
	}
	public static void main(String[] args) {
		 CrossBrowsertestng  obj = new  CrossBrowsertestng ();
		obj.crossbrowserlogin("firefox");
	}
	
	

}
