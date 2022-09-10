package com.pathquest.testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pathquest.utilityclasses.Screenshot_Class;

public class TC002_Verify_Login_Functionality extends TestBase_Class
{

	@Test
	public void loginFunctionalitywithvalidemailIDandPassword() throws IOException
	{		
		Screenshot_Class.screenShotMethod(driver);
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "PathQuest";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		log.info("Manage Company Page is Opened. Test Case 002 is passed.");	
	}
	
}
