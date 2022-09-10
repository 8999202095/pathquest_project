package com.pathquest.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registrationPage_POMClass 
{
	private WebDriver driver;
	
	private Actions act;
	
	@FindBy(xpath="//span[text()='Sign Up With Google']")
	private WebElement signUpWithGoogle;
	
	public void clickOnSignUpWithGoogleLink()
	{
		act.click(signUpWithGoogle).perform();
	}
	
	@FindBy(xpath="//input[@id='f-name']")
	private WebElement FirstName;
	
	public void enterFirstName()
	{
		FirstName.sendKeys("Shashank");
	}
	
	@FindBy(xpath="//input[@id='l-name']")
	private WebElement LastName;
	
	public void enterLastName()
	{
		LastName.sendKeys("Gharmalkar");
	}
	
	@FindBy(xpath="//button[@id='dropdownMenuLink']")
	private WebElement dropDown;
	
	public void clickOnDropDown()
	{
		act.click(dropDown).perform();
	}
	
	@FindBy(xpath="//span[text()=' Business ']")
	private WebElement Business;
	
	public void clickOnBusiness()
	{
		Business.click();
	}
	
	@FindBy(xpath="//input[@id='b-name']")
	private WebElement businessName;
	
	public void enterBusinessName()
	{
		businessName.sendKeys("pathquest");
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailID;
	
	public void enterEmailID()
	{
		emailID.sendKeys("uattestuser@mailinator.com");
	}
	
	@FindBy(xpath="//div[@class='iti__selected-flag']")
	private WebElement countryCode;
	
	public void selectCountryCode()
	{
		act.click(countryCode).perform();
	}
	
	@FindBy(xpath="(//span[text()='India (भारत)'])[1]")
	private WebElement IndiaCode;
	
	public void selectIndiaCode()
	{
		act.click(IndiaCode).perform();
	}
	
	@FindBy(xpath="//input[@id='myPhone']")
	private WebElement phoneNumber;
	
	public void enterPhoneNumber()
	{
		phoneNumber.sendKeys("9999999999");
	}
	
	@FindBy(xpath="//span[contains(text(), 'Accounts Payable')]")
	private WebElement accountsPayable;
	
	public void clickOnAccountsPayable()
	{
		act.click(accountsPayable).perform();
	}

	@FindBy(xpath="//span[contains(text(), 'Business Intelligence')]")
	private WebElement businessIntelligence;
	
	public void clickOnbusinessIntelligence()
	{
		act.click(businessIntelligence).perform();
	}
	
	@FindBy(xpath="//input[@id='customCheck']")
	private WebElement checkBox;
	
	public void clickOnIAgreeToTheTerms()
	{
		act.click(checkBox).perform();
	}
	
	@FindBy(xpath="(//body//button)[2]")
	private WebElement signUpNow;
	
	public void clickOnSignUpButton()
	{
		act.click(signUpNow).perform();
	}
	
	public registrationPage_POMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	
	
	
	
	
	
	
	
}
