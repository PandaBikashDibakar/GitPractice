package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Declaration
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath ="//button[text() =' Login ']")
	private WebElement Loginbutton;
	
	@FindBy(xpath ="//p[text() ='Forgot your password? ']")
	private WebElement Forgotpassword;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//updation
	public void login()
	{
		Username.sendKeys("Admin");
		Password.sendKeys("admin123");
		Loginbutton.click();
	}
}
