package com.flipkart.POMClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {
public static WebDriver driver;
	
	public static void screenshotMethod (WebDriver driver) throws IOException 
	{
		Date date = new Date();
		
		DateFormat d = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
		String newDate = d.format(date);
		
		
		TakesScreenshot take = (TakesScreenshot) driver;
		
		File source = take.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("F:\\\\selenium\\\\chrome driver"
				+ "\\\\screenshot\\\\"+ newDate +".jpg");
		
		FileHandler.copy(source, destination);
		
	}
	

}


