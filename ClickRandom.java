package Demos;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickRandom {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.lambdatest.com/");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		int linkcount = link.size();
		System.out.println(linkcount);
		
		    for (int i = 0; i < linkcount; i++) {
			String linktext = link.get(i).getText();
			System.out.println(linktext);
		}

		Random r = new Random();

		link.get(r.nextInt(2)).click();

		String title = driver.getTitle();

		System.out.println("Page Title is " + title);

		Thread.sleep(5000);
		driver.get("https://www.lambdatest.com/");
	}

}
