package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage 
{
	//Declaration 
		@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
		private WebElement Profileicon;
		
		@FindBy(xpath ="//a[text() ='Logout']")
		private WebElement Logout;
		
		//initialization 
		public Logoutpage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//updation 
		public void logout()
		{
			Profileicon.click();
			Logout.click();
		}
}