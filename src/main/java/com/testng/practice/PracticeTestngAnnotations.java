package com.testng.practice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestngAnnotations {
	
	@Test
	public void test() {
		
		System.out.println("This is a @Test");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("This is a @beforetest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("This is a @beforeMethod");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("This is @AfterTest");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("This is @afterSuite");
	}
	
	

}
