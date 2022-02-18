package com.flipkartDemo.Testclasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.flipkart.POMClasses.FlipkartLogin;
import com.flipkart.POMClasses.HomePageClass;

public class BaseClass {
	
	WebDriver driver;
	@BeforeTest 
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chrome driver\\chromedriver.exe");
		 driver = new ChromeDriver();
					
		   driver.get("https://www.google.co.in");
					
		   System.out.println("Google open successfully");
					
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://www.flipkart.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeMethod
	
	public void login() 
	{
		FlipkartLogin object = new FlipkartLogin(driver);
		object.sendusername();
		object.sendpassword();
		object.clicksubmit();
		System.out.println("Login successfully");
	}
	
	@AfterMethod 
	 public void logout() 
	{
		HomePageClass variable = new HomePageClass(driver);
		variable. movehover();
		variable.clicklogout();
	}
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}


}
