package com.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.com");
		WebElement source = driver.findElement(By.xpath("(//div[@class=\"other-project-text\"])[1]"));
		WebElement destination = driver.findElement(By.xpath("(//div[@class=\"other-project-text\"])[13]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source,destination).perform();
	}

}
