package com.pathquest.testclasses;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.pathquest.POMClasses.manageCompanies_POMClass;


public class TC003_Verify_LogOut_Functionality extends TestBase_Class
{

	@Test
	public void verifyLogOutFunctionality()
	{
		
		manageCompanies_POMClass DP = new manageCompanies_POMClass(driver);
		
		DP.clickOnProfile();
		log.info("Clicked on Profile.");
		
		DP.clickOnLogOutButton();
		log.info("Clicked on LogOut Button.");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Welcome | PathQuest";
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		log.info("Test Case 003 is passed.");
		
	}
	
	
	
	
}
