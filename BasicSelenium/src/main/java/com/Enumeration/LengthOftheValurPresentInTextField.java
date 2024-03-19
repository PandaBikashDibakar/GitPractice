package com.Enumeration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LengthOftheValurPresentInTextField {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement Username = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		Username.sendKeys("Bikash");
		String value =Username.getAttribute("value");
		System.out.println(value.length());
		for (int i =0; i<=value.length(); i++)
		{
			Thread.sleep(2000);
			Username.sendKeys(Keys.BACK_SPACE);
		}
	}
}
