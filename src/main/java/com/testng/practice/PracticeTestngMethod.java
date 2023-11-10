package com.testng.practice;

import org.testng.annotations.Test;

public class PracticeTestngMethod {
	
	@Test(priority=0, groups= {"smoke"},invocationCount = 5)
	public void getlogin() {
		System.out.println("this is a login method");
	}
	
	
	@Test(priority=1, groups= {"Regression","smoke"},dependsOnMethods = {"getlogin"})
	public void getdress() {
		System.out.println("this is a dress method");
	}
	
	
	@Test(priority=2,groups= {"smoke"})
	public void getcart() {
		System.out.println("this is a cart methid");
	}
	
	
	@Test(priority=3,enabled=false)
	public void getpayment() {
		System.out.println("this is a payment method");
	}
	
	
	@Test(priority=4)
	public void getplceorder() {
		System.out.println("this is a placeorder method");
	}
	
	
	

}
