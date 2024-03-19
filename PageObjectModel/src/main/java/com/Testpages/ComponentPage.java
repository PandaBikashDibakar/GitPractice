package com.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentPage 
{
	//Declaration
	@FindBy(xpath = "//a[text() ='Components (2)']")
	private WebElement Component;
	
	@FindBy(xpath = "(//a[text() ='Monitors (2)'])[2]")
	private WebElement Monitors;
	//initialization 
	public ComponentPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	//utilization 
	public void component()
	{
		Component.click();
	}
	
	public void monitors()
	{
		Monitors.click();
	}
}
