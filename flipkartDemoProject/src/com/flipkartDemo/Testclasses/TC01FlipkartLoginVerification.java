package com.flipkartDemo.Testclasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.flipkart.POMClasses.FlipkartLogin;
import com.flipkart.POMClasses.ScreenShotClass;

public class TC01FlipkartLoginVerification 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chrome driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		System.out.println("google open successfully");
		
		
		driver.get("https://www.flipkart.com/");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FlipkartLogin object = new FlipkartLogin(driver);
		object.sendusername();
		object.sendpassword();
		object.clicksubmit();
		System.out.println("Login successfully");
		ScreenShotClass.screenshotMethod(driver);
		System.out.println("screenshot taken");
		driver.close();
		
		
}
}
