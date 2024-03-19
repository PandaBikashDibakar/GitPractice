package com.openBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\user\\Desktop\\Checkboxes.html");
		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(Checkboxes.size());
		for(int i =0; i<Checkboxes.size(); i++)
		{
			Thread.sleep(2000);
			Checkboxes.get(i).click();
		}
	}

}
