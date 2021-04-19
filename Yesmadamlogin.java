package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yesmadamlogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yesmadam.com/welcome");
		//((JavascriptExecutor)driver).executeScript("scroll(0,1600)");
		//driver.findElement(By.xpath("//div[@class='srvcCnt srvcCnt6 ng-star-inserted']")).click();
		//driver.navigate().to("https://www.yesmadam.com/welcome");
		
		/*Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[@class='srvcCnt srvcCnt6 ng-star-inserted']"));
		actions.moveToElement(element).click().perform();*/
		
		/*By loadingImage = By.xpath("//div[@class='srvcCnt srvcCnt6 ng-star-inserted']");

		long timeOutInSeconds = 1000;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));*/
		
		/*WebElement firstbutton= driver.findElement(By.xpath("//div[@class='srvcCnt srvcCnt6 ng-star-inserted']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(firstbutton);
		actions.perform();*/
		
		

		
	
	}

}
