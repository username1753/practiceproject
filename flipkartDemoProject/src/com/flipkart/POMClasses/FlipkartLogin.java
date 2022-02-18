package com.flipkart.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogin 
{
	WebDriver driver;
	Actions act;
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
     private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submit;
	@FindBy(xpath="//a[text()='New to Flipkart? Create an account']")
	private WebElement newuser;
	
	public FlipkartLogin (WebDriver driver) 
	{
		this.driver= driver;
	PageFactory.initElements(driver, this);
		act = new Actions (driver);
	}
		
	public void sendusername() {
		username.sendKeys("bhushan.khenat@gmail.com");
	}
	
	public void sendpassword() {
		password.sendKeys("Bhushan1753#");
	}
		
		public void clicksubmit() {
			act.click(submit).perform();
		
	}
		public void newuser() {
			act.click(newuser).perform();
		}
		
	
}
