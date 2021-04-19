package Demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frist_Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String appTitle=driver.getTitle();
		String expTitle="Google";
		if (appTitle.equals (expTitle)){
		System.out.println("Verification Successfull");
		}
		else{
		System.out.println("Verification Failed");

		}
		driver.close();
		System.exit(0);
		}
		
	}


