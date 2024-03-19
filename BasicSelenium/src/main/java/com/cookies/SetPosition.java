package com.cookies;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SetPosition 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver()	.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Point p = new Point(291,390);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
	}
}
