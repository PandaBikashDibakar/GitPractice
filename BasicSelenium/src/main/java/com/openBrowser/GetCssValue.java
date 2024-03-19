package com.openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCssValue 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		 System.out.println(Username.getCssValue("font-size"));
		 System.out.println(Username.getCssValue("font-family"));
	}
}
