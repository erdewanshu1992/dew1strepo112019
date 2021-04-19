package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Registration {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	/*@Test
	public void FacebookRegistration() {
		String title = driver.getTitle();
		System.out.println("title");	
	}*/
	
	@Test
	public void CreateNewAccountButton() {
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void iFrameElement() {
		WebElement iframe = driver.findElement(By.xpath("//iFrame[@style='position: absolute; top: -10px;']"));
	}
	@Test
	public void RegistrationPopUPpage() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("Niharika");
	    Thread.sleep(3000);
	    driver.findElement(By.name("lastname")).sendKeys("Bacchan");
	    Thread.sleep(3000);
	    driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
	    Thread.sleep(3000);
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("il9HNJ1234");
	    Thread.sleep(3000);
	}
	@Test
	public void DropDownCalender() throws InterruptedException {
		Select day = new Select(driver.findElement(By.id("day")));
	    Thread.sleep(3000);
	    day.selectByVisibleText("12");

	    Select month = new Select(driver.findElement(By.id("month")));
	    Thread.sleep(3000);
	    month.selectByValue("5");

	    Select year = new Select(driver.findElement(By.id("year")));
	    Thread.sleep(3000);
	    year.selectByValue("1993");
	    driver.findElement(By.xpath("//input[@value='2']")).click();
	    Thread.sleep(3000);
	}

}
