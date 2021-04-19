package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.lambdatest.com/pricing");
	    ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	     Actions ac = new Actions(driver);
	     WebElement wb = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/p"));
	     ac.moveToElement(wb).build().perform();
	     Thread.sleep(3000);
	     WebElement plan = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div/button"));
			plan.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='4 Parallel Tests(25 Users)']")).click();
			Thread.sleep(4000);
			driver.quit(); 
	}

}
