package com.generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class PracticeDragAndDrop {
	public void getDragAndDrop() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions ac = new Actions(driver);
		
		MasterPagefactory1 mpf1 = new  MasterPagefactory1(driver);
		//Drag oslo, Drop Norway
		ac.dragAndDrop(mpf1.getDragoslo(), mpf1.getDropNorway()).perform();
		ac.dragAndDrop(mpf1.getDragrome(), mpf1.getDropitaly()).perform();
		ac.dragAndDrop(mpf1.getDragwashington(), mpf1.getDropusa()).perform();
		ac.dragAndDrop(mpf1.getDragseoul(), mpf1.getDropsouthkorea()).perform();
		ac.dragAndDrop(mpf1.getDragmadrid(), mpf1.getDropspain()).perform();
	}
    public static void main(String[] args) {
	PracticeDragAndDrop obj = new PracticeDragAndDrop();
	obj.getDragAndDrop();
    }
}
