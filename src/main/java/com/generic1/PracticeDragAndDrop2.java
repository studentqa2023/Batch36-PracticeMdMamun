package com.generic1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDrop2 {
	
	WebDriver driver;
	
	public void practiceDrag() {
		
		DriverManager dm = new DriverManager();	
		
		driver = dm.getDriver(driver);
		
		driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		MasterPagefactory1 mpf1 = new MasterPagefactory1(driver);
		Actions  ac = new Actions(driver);
		ac.dragAndDrop(mpf1.getStockholm(), mpf1.getSweden()).perform();
		
	}
	
  public static void main(String[] args) {
	  PracticeDragAndDrop2 obj = new PracticeDragAndDrop2();
	  obj.practiceDrag();
	
}
}



