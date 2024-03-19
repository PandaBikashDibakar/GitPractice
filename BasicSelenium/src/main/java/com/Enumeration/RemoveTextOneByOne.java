package com.Enumeration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveTextOneByOne 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("panda");
		for(int i =0; i<5; i++)
		{
			Thread.sleep(2000);
			Username.sendKeys(Keys.BACK_SPACE);
		}
	}

}
