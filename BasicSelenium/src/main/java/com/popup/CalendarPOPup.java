package com.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPOPup 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text() ='Departure']")).click();
		WebElement monthyear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[2]"));
		String month =monthyear.getText().split(" ")[0];
		String year = monthyear.getText().split(" ")[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equalsIgnoreCase("April")&&year.equalsIgnoreCase("2024")))
		{
			driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
			break;
		}
		WebElement date = driver.findElement(By.xpath("(//p[text() ='30'])[2]"));
		Actions actions = new Actions(driver);
		actions.click(date).perform();
	}
}
