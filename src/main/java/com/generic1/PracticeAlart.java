package com.generic1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAlart {
	
	public void getalart() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.getText();
		alert.accept();
		
	}
	public static void main(String[] args) {
		 PracticeAlart obj = new  PracticeAlart();
		 obj.getalart();
	}

}
