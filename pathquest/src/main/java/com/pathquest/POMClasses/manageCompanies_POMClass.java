package com.pathquest.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class manageCompanies_POMClass 
{
	private WebDriver driver;
	
	private Actions act;
	
	@FindBy(xpath="//div[@id='sidebar_logo']")
	private WebElement sidebarLogo;
	
	public void clickOnSideBarLogo()
	{
		act.click(sidebarLogo).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Dashboard']")
	private WebElement dashboard;
	
	public void clickOnDashboard()
	{
		act.click(dashboard).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Business Intelligence']")
	private WebElement businessIntelligence;
	
	public void clickOnBusinessIntelligence()
	{
		act.click(businessIntelligence).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Financial Analysis']")
	private WebElement financialAnalysis;
	
	public void clickOnFinancialAnalysis()
	{
		act.click(financialAnalysis).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Financial Reports']")
	private WebElement financialReports;
	
	public void clickOnFinancialReports()
	{
		act.click(financialReports).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Custom Reports']")
	private WebElement customReports;
	
	public void clickOnCustomReports()
	{
		act.click(customReports).perform();
	}
	
	@FindBy(xpath="//a[@id='nav_Forecast']")
	private WebElement Forecast;
	
	public void clickOnForecast()
	{
		act.click(Forecast).perform();
	}
	
	@FindBy(xpath="//span[@id='dd_nav']")
	private WebElement profile;
	
	public void clickOnProfile()
	{
		act.click(profile).perform();
	}
	
	@FindBy(xpath="//span[text()='logout']")
	private WebElement LogOut;
	
	public void clickOnLogOutButton()
	{
		act.click(LogOut).perform();
	}
	
	public manageCompanies_POMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
	
	
	
	
	
	
	
	
}
