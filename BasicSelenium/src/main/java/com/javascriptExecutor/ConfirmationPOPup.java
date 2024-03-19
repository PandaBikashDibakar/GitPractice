package com.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationPOPup 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gogle.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("confirm('are you sure'!)");
		driver.switchTo().alert().accept();
	}

}