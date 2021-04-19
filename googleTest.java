package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {

	WebDriver driver;
/*	@BeforeMethod//1//4//7
	public void setUp() throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	}
*/	
	@Test//2
	public void googleTitle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Thread.sleep(3000);

		
	String title= driver.getTitle();
	System.out.println("title");
	}
	/*@Test//8
	public void googleLogoTest() {
	boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}
	@Test//5
	public void maleLinkTest() {
	boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
	}*/
	@AfterMethod//3//6//9
	public void tearDown() {
	driver.quit();
}
}