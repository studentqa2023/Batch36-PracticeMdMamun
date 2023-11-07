package com.generic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDropdown {
	public void getDropdown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        
		driver.navigate().to("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		Select sc = new Select(driver.findElement(By.xpath("//select")));
		//Select Cyprus by using selectByVisivleText()
		sc.selectByVisibleText("Cyprus");
		
		
		//Select Algeria by using selectByindex()
		sc.selectByIndex(3);
		
		//Select Bangladesh by using selectByValue
		sc.selectByValue("BGD");
		
	}
	public static void main(String[] args) {
		PracticeDropdown obj = new PracticeDropdown();
	obj.getDropdown();
	}
}
