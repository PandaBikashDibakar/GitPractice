package com.javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<=10; i++)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		Thread.sleep(2000);
		for(int i=0; i<=10; i++)
		{
			js.executeScript("window.scrollBy(0,-500)");
		}
	}

}
