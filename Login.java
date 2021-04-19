package Demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		// Create a new instance of the Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//  Wait For Page To Load
// Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("https://mail.google.com/");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.id("Email")).sendKeys(" YOUR USER NAME");
		// Enter Password
		driver.findElement(By.id("Passwd")).sendKeys("YOUR PASSWORD");
		// Wait For Page To Load
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Click on 'Sign In' button
		driver.findElement(By.id("signIn")).click();
		//Click on Compose Mail.
		driver.findElement(By.xpath("//div[@class='z0']/div")).click();
		// Click on the image icon present in the top right navigational Bar
		driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();
		//Click on 'Logout' Button
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		//Close the browser.
		driver.close();
		
	}

}
