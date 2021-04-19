package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.postman.com/";
        String expectedTitle = "Postman | The Collaboration Platform for API Development";
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
