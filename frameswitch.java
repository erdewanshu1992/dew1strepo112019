package Demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frameswitch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    String baseUrl="https://www.udacity.com/";
	    driver.get(baseUrl);
	    String Title="Udacity - Free Online Courses and Nanodegree Programs";
	    List<WebElement> linkElements = driver.findElements(By.tagName("a"));
	    }
	}


