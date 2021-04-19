package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YesMadam_Reg {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.yesmadam.com/welcome");
		driver.navigate().to("https://www.yesmadam.com/welcome");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginSignup")).click();
		//driver.findElement(By.className("loginFrmCnt"));
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/input")).sendKeys("8765436599");
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/button")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]/div/div"));
		//driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("jhgfsdgfyt@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]/div/div/div[2]/div[1]/div/form/div[4]/span[2]/input")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='refercode']")).sendKeys("box");
		//driver.findElement(By.xpath("//*[@id=\"trmsCndtion\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/section/app-pages/div/app-header/div[4]/div/div/div[2]/div[2]/span/label/a/u")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,9000)", "");
	}

}
