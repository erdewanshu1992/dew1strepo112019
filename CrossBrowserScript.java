package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserScript {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	
	public void setup(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
			driver = new ChromeDriver();
		}
				else if(browser.equalsIgnoreCase("Edge")){
					System.setProperty("webdriver.edge.driver","C:\\Users\\erdew\\Desktop\\Seleniumfiles\\MicrosoftWebDriver.exe");
					driver = new EdgeDriver();
				}
		else{
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("https://www.yesmadam.com/welcome");
		

}
}
