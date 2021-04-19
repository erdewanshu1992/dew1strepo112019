package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YesmadamTest {

	WebDriver driver;
	
	@BeforeMethod
		public void setUp() throws InterruptedException {;
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yesmadam.com/welcome");
		Thread.sleep(3000);
	}
	@Test
	    public void yesmadamTitle() {
		System.out.println("Title");
	}
	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/
}
