package com.pathquest.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashBoard_POMClass
{
	private WebDriver driver;
	
	private Actions act;
	
	@FindBy(xpath="//span[contains(text(), 'settings')]")
	private WebElement settingsIcon;
	
	public void clickOnSettingsIcon()
	{
		act.click(settingsIcon).perform();
	}
	
	
	
	public dashBoard_POMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
	}
	
	
}
