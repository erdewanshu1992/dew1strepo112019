package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.yesmadam.com/welcome";
        String expectedTitle = "Best salon at home services | Yesmadam.com";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
            
        } else {
        	
            System.out.println("Test Failed");
        }
       
        driver.close();

	}

}
