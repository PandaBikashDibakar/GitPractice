package com.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//Declaration 
	@FindBy(xpath = "//a[text() ='Laptops & Notebooks']")
	private WebElement Laptop;
	
	@FindBy(xpath ="//a[text() ='Show AllLaptops & Notebooks']")
	private WebElement allLaptop;
	//Initialization 
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	// Utilization 
	public void notebook()
	{
		Laptop.click();
	}
	public void showall()
	{
		allLaptop.click();
	}
}
