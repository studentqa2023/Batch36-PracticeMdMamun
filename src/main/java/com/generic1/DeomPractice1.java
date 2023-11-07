package com.generic1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.util1.BaseConfig1;
import com.util1.HighLighter1;
import com.util1.ScreenShot;

public class DeomPractice1 {
@SuppressWarnings("deprecation")
public void getDemoLogin() {
	//WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	WebDriver driver = new ChromeDriver(options);
	//implicite wait
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.navigate().to(BaseConfig1.getConfigValue("QA_URL"));
	driver.manage().window().maximize();
	MasterPagefactory1 mpf1 = new MasterPagefactory1(driver);
	//Highlighter clickbtn
	//take screenshot
	HighLighter1.addColor(driver, mpf1.getLoginbtn1());
	ScreenShot.getScreenShot(driver, "loginbtn click ");
    mpf1.getLoginbtn1().click();
    
    //Highlighter emailfield
    HighLighter1.addColor(driver,mpf1.getEmailfield() );
    mpf1.getEmailfield().sendKeys(BaseConfig1.getConfigValue("email"));
    
   //Highlighte passwordfield
    HighLighter1.addColor(driver,mpf1.getPasswordfield());  
    mpf1.getPasswordfield().sendKeys(BaseConfig1.getConfigValue("password"));
    
    //Explicite Wait
    //Highlite login click
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    
    HighLighter1.addColor(driver,mpf1.getLoginbtn2());
    mpf1.getLoginbtn2().click();
    //mpf1.getLogoutbtn().click();
    if(mpf1.getLogoutbtn().isDisplayed()) {
    	System.out.println("Login successful!");
    	
    }
    else {
    	System.out.println("Login failed!");
    }	
    
}

}
