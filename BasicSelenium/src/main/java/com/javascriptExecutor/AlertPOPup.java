package com.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPOPup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('What is your value')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
