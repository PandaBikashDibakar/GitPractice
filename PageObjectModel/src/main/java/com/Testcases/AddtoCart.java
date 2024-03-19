package com.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Testpages.AddtoCartPage;
import com.Testpages.ComponentPage;
import com.Testpages.HomePage;
import com.Testpages.MonitorsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		HomePage home = new HomePage (driver);
		home.notebook();
		home. showall();
		ComponentPage  compo = new ComponentPage (driver);
		compo.component();
		compo.monitors();
		 MonitorsPage monitors = new  MonitorsPage (driver);
		 monitors. apple();
		 AddtoCartPage  add =new AddtoCartPage (driver);
		 add.button();
		 add.Checkbutton();
		 add.Select();
		 add.text();
		 add.upload();
//		 add.Datecalendar();
//		 add.time();
//		 add.dateandtime();
//		 add.ok();
//		add.cart();
	}

}
