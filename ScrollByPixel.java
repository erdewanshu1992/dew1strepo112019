package Demos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Scenario 1: To scroll down the web page by pixel.

public class ScrollByPixel {

	WebDriver driver;
    @Test
    public void ByPixel() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://demo.guru99.com/test/guru99home/");

        //To maximize the window. This code may not work with Selenium 3 jars. If script fails you can remove the line below		
        driver.manage().window().maximize();

        // This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
}
}