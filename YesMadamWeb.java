package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class YesMadamWeb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yesmadam.com/welcome");
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();,eleService");
		//action.moveToElement(eleService).click().perform();
		

	}

}
