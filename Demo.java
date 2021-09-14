package chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver Yesmadam = new ChromeDriver();
		//Yesmadam.get("https://www.yesmadam.com/welcome");
		Yesmadam.navigate().to("https://www.yesmadam.com/welcome");
		/*
		 * Yesmadam.manage().window().maximize();
		 * 
		 * Yesmadam.navigate().to("https://yesmadam.com/blog/");
		 * Yesmadam.navigate().forward(); Yesmadam.navigate().back();
		 * Yesmadam.navigate().to("https://www.yesmadam.com/contact-us");
		 * Yesmadam.navigate().refresh(); Yesmadam.navigate().forward();
		 * Yesmadam.navigate().back();
		 */
		  //Yesmadam.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div")).click();
		  
			/*
			 * WebElement element = Yesmadam.findElement(By.
			 * xpath("//img[@style='width: 100px; margin-top: 33px']")); Point point =
			 * element.getLocation(); System.out.println("X cordinate : " + point.x +
			 * "Y cordinate: " + point.y);
			 */ 
		  
		  
		  //Yesmadam.findElement(By.xpath("//img[@id='48']")).click();

			/*
			 * WebElement element = Yesmadam.findElement(By.xpath("//img[@id='48']")); Point
			 * point = element.getLocation(); System.out.println("X cordinate : " + point.x
			 * + "Y cordinate: " + point.y);
			 */ 
		  Actions act = new Actions(Yesmadam);
		  act.moveByOffset(368, 1654).contextClick().build().perform();
		  Thread.sleep(3000);
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
