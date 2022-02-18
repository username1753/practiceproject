package com.flipkartDemo.Testclasses;

import org.testng.annotations.Test;

import com.flipkart.POMClasses.HomePageClass;

public class VerifiySearchFunctionality extends BaseClass
{
@Test

public void logout() 
{
	HomePageClass variable = new HomePageClass(driver);
	variable. movehover();
	variable.clicklogout();
}
}
