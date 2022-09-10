package com.pathquest.testclasses;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pathquest.POMClasses.logIn_Page_POMClass;

public class TestBase_Class 
{
	WebDriver driver;
	   
	Logger log = Logger.getLogger("pathquest");
	
	@BeforeMethod
	public void setUpMethod()
	{
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", 
				"./Drivers/geckodriver.exe");
		driver = new ChromeDriver();
		log.info("Browser is opened.");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		log.info("Browser is maximized.");
		
		driver.get("https://uatlogin.pathquest.com/");
		log.info("URL is entered.");
		
		logIn_Page_POMClass LP = new logIn_Page_POMClass(driver);
		
		LP.enterEmailID();
		log.info("Email ID is entered.");
		
		LP.enterPassword();
		log.info("Password is entered.");
		
		LP.clickOnLogInNow();
		log.info("Clicked on login button");
		
		}
	
	@AfterMethod
	public void tearDownMethod()
	{
		driver.close();
		log.info("Browser is closed.");
	}
	
	
	
	
	
	
}
