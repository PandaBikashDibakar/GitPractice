package com.Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("name"));
		
	}

}
