package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YesmadamScroll {

	WebDriver driver;
    @Test
    public void ScrollHorizontally() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("https://www.yesmadam.com/welcome");

        WebElement Element = driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-footer/footer/div/div[2]/div[5]/div[2]"));

        //This will scroll the page Horizontally till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
}
}