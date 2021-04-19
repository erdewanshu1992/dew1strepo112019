package Demos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwaits {

	private static final int DEFAULT_POLL_TIME = 0;
	private static final int DEFAULT_WAIT_TIME = 0;
	public static WebElement waitForVisibleFluentWait(WebElement element) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    final Wait<WebDriver> wait = getDefaultFluentWait()
	            .ignoring(NoSuchElementException.class)
	            .ignoring(ElementNotVisibleException.class);
	    wait.until(ExpectedConditions.visibilityOf(element));
	    return element;
	}
	private static FluentWait<WebDriver> getDefaultFluentWait() {
	    return getCustomFluentWait(DEFAULT_WAIT_TIME, DEFAULT_POLL_TIME);
	}
	private static FluentWait<WebDriver> getCustomFluentWait(int waitTime, int pollTime) {
	    return new FluentWait<>(driver)
	            .withTimeout(waitTime, TimeUnit.SECONDS)
	            .pollingEvery(pollTime, TimeUnit.SECONDS);
	}
	
}
