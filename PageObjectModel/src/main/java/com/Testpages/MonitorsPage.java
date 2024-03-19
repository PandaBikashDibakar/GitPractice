package com.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonitorsPage 
{
	//Declaration
	@FindBy(xpath = "//img[@src='https://tutorialsninja.com/demo/image/cache/catalog/demo/apple_cinema_30-228x228.jpg']")
	private WebElement applelaptop;
	
	//initialization 
	public  MonitorsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization 
	public void apple()
	{
		applelaptop.click();
	}
}
