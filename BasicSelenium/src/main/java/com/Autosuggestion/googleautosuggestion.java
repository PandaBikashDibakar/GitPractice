package com.Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleautosuggestion
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		 WebElement searchbar = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
		 searchbar.sendKeys("selenium");
		List<WebElement> elements =  driver.findElements(By.xpath("//span[text() ='selenium']"));
		for (WebElement element : elements)
		{
			if(element.getText().equalsIgnoreCase("selenium testing"))
			{
				element.click();
			}
		}
	}
}
