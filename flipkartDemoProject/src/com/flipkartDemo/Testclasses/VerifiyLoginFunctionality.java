package com.flipkartDemo.Testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.POMClasses.HomePageClass;



public class VerifiyLoginFunctionality extends BaseClass
{
	@Test
	public void login()
	{
		String expectedUrl = ("https://www.flipkart.com/");
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
		System.out.println("login successful");
		
	}
	
	
	

}
