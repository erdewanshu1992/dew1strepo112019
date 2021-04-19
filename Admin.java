package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://api-stage-aws.yesmadam.co.in/admin/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("7011565023");
		driver.findElement(By.id("password")).sendKeys("Dewanshu@098");
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		driver.findElement(By.id("sign-in"));
		Thread.sleep(30000);
	}

}
