package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
	//Declaration 
	@FindBy(xpath = "//button[text() =' Add ']")
	private WebElement addbutton;

	@FindBy(xpath ="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement Userrole;

	@FindBy(xpath = "(//span[text() ='Admin'])[2]")
	private WebElement selectrole;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement status;

	@FindBy(xpath = "//span[text() ='Enabled']")
	private WebElement Enabled;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement EmployeeNameField;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement Username;

	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmpassword;

	@FindBy(xpath ="//button[text() =' Save ']")
	private WebElement save;
	//initialization 
	public  AdminPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//updation 
	public void add()
	{
		addbutton.click();
	}

	public void userrole()
	{
		Userrole.click();
		selectrole.click();
	}

	public void status()
	{
		status.click();
		Enabled.click();
	}

	public void Employeed()
	{
		EmployeeNameField.sendKeys("Bikash");
		Username.sendKeys("rahul");
		
		password.sendKeys("Rahul Das");
		confirmpassword.sendKeys("@panda");
		save.click();
	}

}
