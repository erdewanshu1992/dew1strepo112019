package MyYesMadamWeb.MyYesMadamWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebAutomate {

	@Test
	public void Automation () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yesmadam.com/welcome");
		 //driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();          
		 Thread.sleep(3000);
		 Actions action=new Actions(driver);

		 //Sanitization
		 WebElement elesanitization = driver.findElement(By.xpath("//a[text()=' Sanitization ']"));        
		 action.moveToElement(elesanitization).click().perform();
		 System.out.println("Sanitization");

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 
		 //Donate
		 Thread.sleep(3000);
		 WebElement eledonate=driver.findElement(By.xpath("//a[text()=' Donate ']"));
		 action.moveToElement(eledonate).click().perform();
		 System.out.println("Donate");

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();

		 //My Appointment
		 Thread.sleep(3000);
		 WebElement eleMyappointment=driver.findElement(By.xpath("//*[@class='fas fa-calendar-alt']"));
		 action.moveToElement(eleMyappointment).click().perform();
		 Thread.sleep(3000);
		 //LogIn Cross Button
		 driver.findElement(By.xpath("//span[@class='loginClsBtn']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("My Appointment");

		 // Profile
		 WebElement eleProfile= driver.findElement(By.xpath("//a[text()=' Profile ']"));
		 action.moveToElement(eleProfile).click().perform();
		 Thread.sleep(3000);
		 //LogIn Cross Button
		 driver.findElement(By.xpath("//span[@class='loginClsBtn']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("Profile");

		 //Yesmadam Wallet
		 Thread.sleep(3000);
		 WebElement eleYesmadamWallet=driver.findElement(By.xpath("//i[@class='fas fa-wallet']"));
		 action.moveToElement(eleYesmadamWallet).click().perform();
		 //Login Cross Button
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@class='loginClsBtn']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("Wallet");
		 
		 //Refer A Friend
		 Thread.sleep(3000);
		 WebElement eleRefer=driver.findElement(By.xpath("//a[text()=' Refer A Friend ']"));
		 action.moveToElement(eleRefer).click().perform();
		 //Login Cross Button
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[@class='loginClsBtn']")).click();  
		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("Refer-a-friend");
		 
		 //Team of Picassos
		 Thread.sleep(3000);
		 WebElement elePicassos=driver.findElement(By.xpath("//a[text()=' Team of Picassos ']"));
		 action.moveToElement(elePicassos).click().perform();

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("Team of Picassos");
		 
		 //Franchise
		 Thread.sleep(3000);
		 WebElement eleFranchise=driver.findElement(By.xpath("//a[text()=' Franchisee ']"));
		 action.moveToElement(eleFranchise).click().perform();
		 System.out.println("Franchise");

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 
		 //Privacy Policy
		 Thread.sleep(3000);
		 WebElement elePrivacyPolicy=driver.findElement(By.xpath("//a[text()=' Privacy Policy ']"));
		 action.moveToElement(elePrivacyPolicy).click().perform();
		 System.out.println("Privacy Policy");

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 
		 //FAQ's
		 Thread.sleep(3000);
		 WebElement eleFAQ=driver.findElement(By.xpath("//i[@class='fas fa-question']"));
		 action.moveToElement(eleFAQ).click().perform();
		 System.out.println("FAQ");

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 
		 //Contact Us
		 Thread.sleep(3000);
		 WebElement eleContactUS=driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		 action.moveToElement(eleContactUS).click().perform();

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 System.out.println("Contact US");
		 
		 //Cart
		 Thread.sleep(3000);
		 WebElement eleCart=driver.findElement(By.xpath("//a[text()=' About Us ']"));
		 action.moveToElement(eleCart).click().perform();

		 Thread.sleep(3000);
		 driver.findElement(By.id("hmbrgrMenu")).click();
		 //About US
		 Thread.sleep(3000);
		 WebElement eleAboutUS=driver.findElement(By.xpath("(//*[@class='fab fa-readme'])[2]"));
		 action.moveToElement(eleAboutUS).click().perform();
		 System.out.println("About US");

		 //Thread.sleep(3000);
		 //driver.findElement(By.id("hmbrgrMenu")).click();
		 
		//Header Donate
		 Thread.sleep(3000);
		 WebElement eleheaderdonate=driver.findElement(By.xpath("//li[text()=' Donate ']"));
		 action.moveToElement(eleheaderdonate).click().perform();
		 System.out.println("Header Donate");


		 //Thread.sleep(3000);
		 
		 //Header Team of Picassos
		 Thread.sleep(3000);
		 WebElement eleheaderteamofpicassos=driver.findElement(By.xpath("//li[text()=' Team of Picassos ']"));
		 action.moveToElement(eleheaderteamofpicassos).click().perform();
		 System.out.println("Header Team of Picassos");

		 //HeaderFranchisee
		 Thread.sleep(3000);
		 WebElement eleheaderfranchise=driver.findElement(By.xpath("//li[text()=' Franchisee ']"));
		 action.moveToElement(eleheaderfranchise).click().perform();
		 System.out.println("HeaderFranchise");

		 //YesmadamHome
		 Thread.sleep(3000);
		 WebElement elehome=driver.findElement(By.xpath("(//img)[1]"));
		 action.moveToElement(elehome).click().perform();
		 System.out.println("YesmadamHome");

		 //Cart Icon
		 Thread.sleep(3000);
		 WebElement eleCarticon=driver.findElement(By.xpath("//div[@class='cart showindis ng-star-inserted']"));
		 action.moveToElement(eleCarticon).click().perform();
		 System.out.println("Cart Icon");

		 //ok
		 Thread.sleep(3000);
		 WebElement eleok=driver.findElement(By.xpath("//span[text()=' OK ']"));
		 action.moveToElement(eleok).click().perform();
		 System.out.println("ok");
		 driver.quit();
	}
}
