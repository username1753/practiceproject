package com.flipkart.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	WebDriver driver ;
	Actions act;
	@FindBy (xpath=("(//div[@class='_28p97w'])[1]"))
	 private WebElement hover;
	
	@FindBy (xpath=("//div[text()='Logout']"))
	private WebElement logout;
	
	@FindBy (xpath=("//input[@type='text']"))
	private WebElement search;
	
	@FindBy (xpath=("//div[text()='APPLE iPhone 12 (Black, 64 GB)']"))
	private WebElement product;
	
	
	// constructor
	 public HomePageClass (WebDriver driver) 
	 {
	this.driver = driver;
	PageFactory.initElements(driver,this);
	act = new Actions (driver);
	 }

	 public void movehover() 
	 {
		 act.moveToElement(hover).perform();
	 }
		 public void clicklogout() 
		 {
		act.click(logout).perform();
		 }
		 
		 public void searchMethod() 
		 {
			act.sendKeys("iphone").perform(); 
		 }
		 
	 }
	 
	 
	 
 

