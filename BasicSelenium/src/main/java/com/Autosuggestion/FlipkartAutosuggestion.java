package com.Autosuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartAutosuggestion
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone");
		List <WebElement> elements = driver.findElements(By.xpath("//span[text() ='iphone']"));
		for(WebElement element : elements)
		{
			
			if(element.getText().equalsIgnoreCase("iphone 13"))
			{
				Thread.sleep(2000);
				element.click();
				break;
			}
		}
	}

}
