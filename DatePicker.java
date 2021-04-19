package Demos;

import java.awt.AWTException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;


public class DatePicker {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser()
	{ 

	driver = BrowserSelection.usingChrome(); 
	}

	@Test
	public void tripDetails() 
	{

	//Modify Wait time as per the Network Ability in the Thread Sleep method

	driver.get("https://www.makemytrip.com/"); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	Thread.sleep(5000);

	try
	{ 

	driver.findElement(By.xpath("//input[@id='hp-widget__depart']")).click();
	Thread.sleep(2000);

	Date d = new Date(1);
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
	String date = formatter.format(d);
	String splitter[] = date.split("-");
	String month_year = splitter[1];
	String day = splitter[0]; 
	System.out.println(month_year);
	System.out.println(day);
	selectDate(month_year,day);
	Thread.sleep(3000);
	


	public void selectDate(String month_year, String select_day) throws InterruptedException
	{ 
	List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-datepicker-title']/span[1]"));

	for (int i=0; i<elements.size();i++)
	{
	System.out.println(elements.get(i).getText());

	//Selecting the month
	if(elements.get(i).getText().equals(month_year))
	{ 

	//Selecting the date 
	List<WebElement> days = driver.findElements(By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a"));

	for (WebElement d:days)
	{ 
	System.out.println(d.getText());
	if(d.getText().equals(select_day))
	{
	d.click();
	Thread.sleep(10000);
	return;
	}
	} 

	} 

	}
	driver.findElement(By.xpath("//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/div/a/span")).click();
	selectDate(month_year,select_day);

	}

	@AfterMethod
	public void closeBrowser()
	{
	driver.quit();
}
	}
