package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement forgotbutton = driver.findElement(By.xpath("//a[text() ='Forgotten password?']"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(forgotbutton).perform();
		actions.release(forgotbutton).perform();
	}
}
