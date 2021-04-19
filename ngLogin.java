package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ngLogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.yesmadam.com/welcome");
	    driver.findElement(ByAngular.model("logIn")).click();

	}

}
