package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FB_Reg {
	WebDriver driver;
	@BeforeMethod()
		public void reg1() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	@Test
	
	public void reg() throws InterruptedException {
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.switchTo().frame("//*[@id=\"facebook\"]/body/iframe");
	
	WebElement iframe = driver.findElement(By.xpath("//iFrame[@style='position: absolute; top: -10px;']"));
    //driver.switchTo().frame(iframe);
	
	//driver.switchTo().frame(2);
    driver.findElement(By.name("firstname")).sendKeys("Niharika");
    //driver.switchTo().parentFrame();
    Thread.sleep(3000);
    driver.findElement(By.name("lastname")).sendKeys("Bacchan");
    Thread.sleep(3000);
    driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
    driver.findElement(By.name("reg_passwd__")).sendKeys("il9HNJ1234");
    Thread.sleep(3000);
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

    //driver.findElement(By.name("websubmit")).click();

    //driver.close();

}


