package com.pathquest.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logIn_Page_POMClass 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath ="//a[text()=' Register Now '] " )
	private WebElement registerNow;
	
	public void clickOnRegisterNow()
	{
		act.click(registerNow).perform();
	}
	
	@FindBy(xpath="//div[@class='thirdParty-btn']")
	private WebElement signInWithGoogle;
	
	public void clickOnSignWithGoogle()
	{
		act.click(signInWithGoogle).perform();
	}
	
	@FindBy(xpath="(//body//input)[1]")
	private WebElement EmailID;
	
	public void enterEmailID()
	{
		EmailID.sendKeys("uattestuser@mailinator.com");
	}
	
	@FindBy(xpath="(//body//input)[2]")
	private WebElement password;
	
	public void enterPassword()
	{
		password.sendKeys("P@ssword1234");
	}
	
	@FindBy(xpath="//span[text()=' visibility_off ']")
	private WebElement passwordVisibility;
	
	public void clickOnPasswordVisibility()
	{
		act.click(passwordVisibility).perform();
	}
	
	@FindBy(xpath="(//body//input)[3]")
	private WebElement keepMeLoggedIn;
	
	public void clickOnKeepMeLoggedIn()
	{
		act.click(keepMeLoggedIn).perform();
	}
	
	@FindBy(xpath="//p[text()=' Forgot password? ']")
	private WebElement forgotPassword;
	
	public void clickOnForgotPassword()
	{
		act.click(forgotPassword).perform();
	}
	
	@FindBy(xpath="//body//button")
	private WebElement loginNow;
	
	public void clickOnLogInNow()
	{
		act.click(loginNow).perform();
	}
	
	@FindBy(xpath="//a[text()=' Privacy Policy ']")
	private WebElement privacyPolicy;
	
	public void clickOnPrivacyPolicy()
	{
		act.click(privacyPolicy).perform();
	}
	
	@FindBy(xpath="//a[text()=' Client Service Agreement ']")
	private WebElement clientServiceAgreement;
	
	public void clickOnClientServiceAgreement()
	{
		act.click(clientServiceAgreement).perform();
	}
	
	public logIn_Page_POMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}

	
	
	
	
	
	
	
	
	
	
}
