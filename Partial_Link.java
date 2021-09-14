package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Link {

	public static void main(String[] args) {

		  // System Property for Chrome Driver   
		//System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");  
		  
		        // Instantiate a ChromeDriver class.      
		    WebDriver driver=new ChromeDriver();  
		  
		        // Launch Website  
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
	}

}
