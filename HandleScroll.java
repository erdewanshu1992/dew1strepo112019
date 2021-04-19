package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleScroll {

	
	@Test
	    public void scrolldown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.yesmadam.com/welcome");
		driver.navigate().to("https://www.yesmadam.com/welcome");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginSignup")).click();
		driver.findElement(By.className("loginFrmCnt"));
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/input")).sendKeys("8765436599");
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]/div/div"));
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]"));
		Thread.sleep(2000);
		driver.findElement(By.className("nmbrInput ng-untouched ng-pristine ng-invalid")).sendKeys("Testing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)", "");
		Thread.sleep(2000);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

