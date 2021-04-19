package Demos;

import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Robot {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.lambdatest.com/feature");
	       Actions actions = new Actions(driver);
	       WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"vid\"]"));
	       actions.contextClick(elementLocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	       Actions action = new Actions(driver);
	       action.contextClick(elementLocator).build().perform();
	       Robot robot = new Robot();
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	}

}
