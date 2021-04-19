package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultipleOnLink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://accounts.lambdatest.com/login");
	    driver.findElement(By.name("email")).sendKeys("adtiyadw.ivedi61@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("1234567");
        driver.findElement(By.xpath("/html/body/div[1]/section/form/div/div/button\r\n" +"")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/header/aside/ul/li[2]/a")).click();
	    Thread.sleep(2000);
	         for (int i = 0; i < 75; i++) {
	         driver.findElement(By.id("navbarDropdown")).click();
	         Thread.sleep(1000);
}

  }
	}
