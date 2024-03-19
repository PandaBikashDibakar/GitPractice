package com.Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraAutosuggestion
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("tommy");
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		for(WebElement element : elements)
		{
			if(element.getText().equalsIgnoreCase("tommy hilfiger shirt"))
			{
				Thread.sleep(2000);
				element.click();
				break;
			}
		}
	}

}
