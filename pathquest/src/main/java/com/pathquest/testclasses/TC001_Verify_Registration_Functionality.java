package com.pathquest.testclasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pathquest.POMClasses.logIn_Page_POMClass;
import com.pathquest.POMClasses.registrationPage_POMClass;
import com.pathquest.utilityclasses.Screenshot_Class;

public class TC001_Verify_Registration_Functionality 
{
	
	WebDriver driver;
	   
	Logger log = Logger.getLogger("pathquest");
	
	@Test
	public void registration() throws IOException
	{
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Browser is opened.");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		log.info("Browser is maximized.");
		
		driver.get("https://uatlogin.pathquest.com/");
		log.info("URL is entered.");
		
		logIn_Page_POMClass LP = new logIn_Page_POMClass(driver);
		LP.clickOnRegisterNow();
		log.info("Clicked on register now.");
		
		registrationPage_POMClass RP = new registrationPage_POMClass(driver);
		
		RP.enterFirstName();
		log.info("First Name is entered.");
		
		RP.enterLastName();
		log.info("Last Name is entered.");
		
		RP.clickOnDropDown();
		log.info("Clicked on dropdown.");
		
		RP.clickOnBusiness();
		log.info("Clicked on Business.");
		
		RP.enterBusinessName();
		log.info("Business Name is entered.");
		
		RP.enterEmailID();
		log.info("Email ID is entered.");
		
		RP.selectCountryCode();
		log.info("Country code is selected.");
		
		RP.selectIndiaCode();
		log.info("India Country code is selected.");
		
		RP.enterPhoneNumber();
		log.info("Phone Number is entered.");
		
		RP.clickOnAccountsPayable();
		log.info("Clicked on accounts payable.");
		
		RP.clickOnbusinessIntelligence();
		log.info("Clicked on Business Intelligence.");
		
		RP.clickOnIAgreeToTheTerms();
		log.info("Clicked on the check box to agree the terms.");
		
		RP.clickOnSignUpButton();
		log.info("Clicked on SignUp Button");
		
		Screenshot_Class.screenShotMethod(driver);
		
		String actualURL = driver.getCurrentUrl();
		
		String expectedURL = "https://uatsignup.pathquest.com/sign-up";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		log.info("Registration Successful");
}
}