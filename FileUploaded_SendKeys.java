package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploaded_SendKeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/erdew/Desktop/Pic.html");
		//Locating InputBox
		WebElement browse =driver.findElement(By.id("InputBox"));
		//pass the path of the file to be uploaded using Sendkeys method
		browse.sendKeys("D:\\HD WALLPAPER");//
		Thread.sleep(2000);
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(2000);
	}

}
