package com.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//a[text() ='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("pandabikash567@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("@panda567");
		driver.findElement(By.xpath("//button[text() ='Login']")).click();
		driver.findElement(By.xpath("//a[@href='/mnjuser/profile']")).click();
//		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		driver.findElement(By.xpath("//a[text() ='Upload']")).click();
	}

}
