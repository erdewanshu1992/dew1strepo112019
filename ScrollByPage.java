package MyYesMadamWeb.MyYesMadamWeb;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPage {

	public static void main(String[] args) {

		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	       driver.get("https://www.yesmadam.com/welcome");
	       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 

	}

}
