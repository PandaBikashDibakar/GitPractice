package com.Testpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{
	public WebDriver driver;
	public  JavascriptExecutor js;

	//Declaration 
	@FindBy(xpath = "//label[text() ='Small                    (+$12.00) ']")
	private WebElement Radiobutton;

	@FindBy(xpath = "(//input[@name='option[223][]'])[1]")
	private WebElement Checkbox;

	@FindBy(xpath = "//select[@name='option[217]']")
	private WebElement Selectoption;

	@FindBy(xpath = "//option[text() ='Blue                (+$3.60) ']")
	private WebElement blueoption;

	@FindBy(xpath = "//textarea[@placeholder='Textarea']")
	private WebElement Textarea;

	@FindBy(xpath ="//button[@id='button-upload222']")
	private WebElement fileupload;

	@FindBy(xpath = "(//i[@class='fa fa-calendar'])[1]")
	private WebElement Datebutton;;
	
	@FindBy(xpath = "(//i[@class='fa fa-calendar'])[2]")
	private WebElement Time;
	
	@FindBy(xpath ="(//i[@class='fa fa-calendar'])[3]")
	private WebElement DateTime;
	
	@FindBy(xpath = "//button[text() ='Add to Cart']")
	private WebElement addtocart;
	
	//initialization
	public AddtoCartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void button()
	{
		Radiobutton.click();
	}

	public void Checkbutton()
	{
		Checkbox.click();
	}

	public void Select()
	{
		Selectoption.click();
		blueoption.click();
	}

	public void text()
	{
		Textarea.sendKeys("Everything is not good ");
	}

	public void upload()
	{
		String path = "C:\\Users\\user\\Downloads\\Panda Bikash Dibakar_ Resume.pdf";
		StringSelection file = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		fileupload.click();

		try 
		{
			// Use Robot class to paste the file path into the file dialog
			Robot robot = new Robot();
			robot.delay(1000); // Delay to ensure the file dialog is open
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} 

		catch (AWTException e) 
		{
			// Handle AWTException (Robot class-related exception)
			e.printStackTrace();
		} 

		catch (Exception e) 
		{
			// Handle generic Exception
			e.printStackTrace();
		}
	}
	public void Datecalendar()
	{
		Datebutton.click();
		WebElement monthyear = driver.findElement(By.xpath("(//th[text() ='February 2011'])[1]"));
		String month = monthyear.getText().split(" ") [0 ];
		String year = monthyear.getText().split(" ")	[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equalsIgnoreCase("April")&&year.equalsIgnoreCase("2011")))
		{
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			break;
		}
		WebElement date = driver.findElement(By.xpath("(//td[text() ='6'])[1]"));
		Actions actions = new Actions(driver);
		actions.click(date).perform();
	}
	public void time()
	{
		 Time.click();
		WebElement monthyear = driver.findElement(By.xpath("(//th[text() ='February 2011'])[1]"));
		String month = monthyear.getText().split(" ") [0 ];
		String year = monthyear.getText().split(" ")	[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equalsIgnoreCase("April")&&year.equalsIgnoreCase("2011")))
		{
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			break;
		}
		WebElement date = driver.findElement(By.xpath("(//td[text() ='6'])[1]"));
		Actions actions = new Actions(driver);
		actions.click(date).perform();
	}
	
	public void dateandtime()
	{
		DateTime.click();
		WebElement monthyear = driver.findElement(By.xpath("(//th[text() ='February 2011'])[1]"));
		String month = monthyear.getText().split(" ") [0 ];
		String year = monthyear.getText().split(" ")	[1];
		System.out.println(month);
		System.out.println(year);
		while(!(month.equalsIgnoreCase("April")&&year.equalsIgnoreCase("2011")))
		{
			driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			break;
		}
		WebElement date = driver.findElement(By.xpath("(//td[text() ='6'])[1]"));
		Actions actions = new Actions(driver);
		actions.click(date).perform();
	}
	
//	public void ok()
//	{
//		//			driver.switchTo().alert().accept();
//	}
	
	public void cart()
	{
		Actions actions = new Actions(driver);
		actions.click().perform();
	}
	

}


