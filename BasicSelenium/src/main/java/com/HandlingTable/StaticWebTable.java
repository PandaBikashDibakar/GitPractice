package com.HandlingTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTable 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		 List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//thead//tr"));
		 for (int i =0; i<headers.size(); i++)
		 {
			 System.out.println(headers.get(i).getText());
		 }
	}

}
