package com.TestPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TestCases.AdminPage;
import com.TestCases.DeleteCustomer;
import com.TestCases.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCustomer 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage login = new LoginPage(driver);
		login.login();
		DeleteCustomer customer = new DeleteCustomer (driver);
		customer. admin();
		 AdminPage admin = new  AdminPage (driver);
		 admin.add();
		 admin.userrole();
		 admin.status();
		 admin. Employeed();
	}
}
