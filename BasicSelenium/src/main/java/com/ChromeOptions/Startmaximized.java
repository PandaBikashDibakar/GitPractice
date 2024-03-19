package com.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Startmaximized 
{
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
	}

}
