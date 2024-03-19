package com.popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertConformationPOPup 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//button[text() =' Login ']"));
		Actions actions = new Actions(driver);
		actions.click(login).perform();
		driver.findElement(By.xpath("//span[text() ='Admin']")).click();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")).click();
		}
}
