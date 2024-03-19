package com.Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BacjForwardRefresh 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.myntra.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
