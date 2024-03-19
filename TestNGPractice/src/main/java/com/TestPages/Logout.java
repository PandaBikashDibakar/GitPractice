package com.TestPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.TestCases.LoginPage;
import com.TestCases.Logoutpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logout 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage login = new LoginPage(driver);
		login.login();
		Logoutpage  logout = new Logoutpage (driver);
		logout.logout();
	}

}
