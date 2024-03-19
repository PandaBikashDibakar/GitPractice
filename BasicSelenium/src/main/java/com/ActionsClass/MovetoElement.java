package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		 WebElement menlink = driver.findElement(By.xpath("(//a[text() ='Women'])[1]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(menlink).perform();
		 Thread.sleep(2000);
		 WebElement Kidslink = driver.findElement(By.xpath("(//a[text() ='Kids'])[1]"));
		 actions.click(Kidslink).perform();
	}
}
