package com.Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheValuePresntInTextFiels 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement Username = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		Username.sendKeys("Bikash");
//		System.out.println(Username.getAttribute("placeholder"));
		System.out.println(Username.getAttribute("value"));
		
	}

}
