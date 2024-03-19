package com.SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass 
{
	public static void main(String[] args) 
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("C:\\Users\\user\\Desktop\\namedropdown.html");
			WebElement dropdown = driver.findElement(By.xpath("//select[@name='selectedName']"));
			Select sel = new Select(dropdown);
			sel.selectByIndex(2);
			sel.selectByVisibleText("Uday");
	}
}
