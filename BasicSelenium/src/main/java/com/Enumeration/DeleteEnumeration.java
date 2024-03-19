package com.Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteEnumeration 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("Bikash");
		Username.sendKeys(Keys.CONTROL,"a");
		Username.sendKeys(Keys.CONTROL,"c");
//		Username.sendKeys(Keys.BACK_SPACE);
		Username.sendKeys(Keys.DELETE);
	}
}
