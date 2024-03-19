package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer 
{
	//Declaration 
	@FindBy(xpath = "//span[text() ='Admin']")
	private WebElement Adminbutton;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[2]")
	private WebElement Deletebutton;
	
	@FindBy(xpath = "//button[text() =' Yes, Delete ']")
	private WebElement Confirmbutton;
	//initialization 
	public DeleteCustomer (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//updation 
	public void admin()
	{
		Adminbutton.click();
	}
	public void delete()
	{
		Deletebutton.click();
		 Confirmbutton.click();
	}
	
}
