package MyYesMadamWeb.MyYesMadamWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class YMWebTestNG {
	WebDriver driver;
	@Test
	public void yesmadamweb() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	       
	       JavascriptExecutor js = (JavascriptExecutor) driver;

   driver.get("https://www.yesmadam.com/welcome");
	          String strUrl = driver.getCurrentUrl();
	          System.out.println("Current Url is:"+ strUrl);
	          System.out.println("Page title is : " + driver.getTitle());
	          
	       js.executeScript("window.scrollBy(0,9000)");
	       
	       Actions action = new Actions(driver);
	       
		   driver.findElement(By.id("hmbrgrMenu")).click(); 
    WebElement elesanitization = driver.findElement(By.xpath("//a[text()=' Sanitization ']")); 
		       String strUr2 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr2);
		       System.out.println("Page title is : " + driver.getTitle());

		   action.moveToElement(elesanitization).click().perform();
		   
		   Thread.sleep(3000);
		   driver.findElement(By.id("hmbrgrMenu")).click();
		   Thread.sleep(3000);
 	WebElement eledonate=driver.findElement(By.xpath("//a[text()=' Donate ']"));
		       String strUr3 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr3);
		       System.out.println("Page title is : " + driver.getTitle());

		   action.moveToElement(eledonate).click().perform();

			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();

			 Thread.sleep(3000);
		 WebElement eleMyappointment=driver.findElement(By.xpath("//*[@class='fas fa-calendar-alt']"));
		       String strUr4 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr4);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(eleMyappointment).click().perform();
			 
			 Thread.sleep(30000);
			 driver.findElement(By.id("hmbrgrMenu")).click();

		 WebElement eleProfile= driver.findElement(By.xpath("//a[text()=' Profile ']"));
		       String strUr5 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr5);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(eleProfile).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();

			 Thread.sleep(3000);
		 WebElement eleYesmadamWallet=driver.findElement(By.xpath("//i[@class='fas fa-wallet']"));
		       String strUr6 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr6);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(eleYesmadamWallet).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			 Thread.sleep(3000);
		 WebElement eleRefer=driver.findElement(By.xpath("//a[text()=' Refer A Friend ']"));
		       String strUr7 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr7);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(eleRefer).click().perform();
			 
			   Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			   Thread.sleep(3000);
		 WebElement elePicassos=driver.findElement(By.xpath("//a[text()=' Team of Picassos ']"));
		       String strUr8 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr8);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(elePicassos).click().perform();
			
			   Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			   Thread.sleep(3000);
		 WebElement eleFranchise=driver.findElement(By.xpath("//a[text()=' Franchisee ']"));
		       String strUr9 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr9);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(eleFranchise).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			 Thread.sleep(3000);
		 WebElement elePrivacyPolicy=driver.findElement(By.xpath("//a[text()=' Privacy Policy ']"));
		       String strUr10 = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUr10);
		       System.out.println("Page title is : " + driver.getTitle());

			 action.moveToElement(elePrivacyPolicy).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			 Thread.sleep(3000);
		 WebElement eleFAQ=driver.findElement(By.xpath("//i[@class='fas fa-question']"));
			 String strUr11 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr11);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleFAQ).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 
			 Thread.sleep(3000);
		 WebElement eleContactUS=driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
			 String strUr12 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr12);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleContactUS).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();

			 Thread.sleep(3000);
		 WebElement eleCart=driver.findElement(By.xpath("//a[text()=' About Us ']"));
			 String strUr13 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr13);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleCart).click().perform();
			 
			 Thread.sleep(3000);
			 driver.findElement(By.id("hmbrgrMenu")).click();
			 Thread.sleep(3000);
		 WebElement eleAboutUS=driver.findElement(By.xpath("(//*[@class='fab fa-readme'])[2]"));
			 String strUr14 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr14);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleAboutUS).click().perform();

			 Thread.sleep(3000);
		 WebElement eleheaderdonate=driver.findElement(By.xpath("//li[text()=' Donate ']"));
			 String strUr15 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr15);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleheaderdonate).click().perform();
			
			 Thread.sleep(3000);
		 WebElement eleheaderteamofpicassos=driver.findElement(By.xpath("//li[text()=' Team of Picassos ']"));
			 String strUr16 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr16);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleheaderteamofpicassos).click().perform();
			 
			 Thread.sleep(3000);
		 WebElement eleheaderfranchise=driver.findElement(By.xpath("//li[text()=' Franchisee ']"));
			 String strUr17 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr17);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleheaderfranchise).click().perform();
			 
			 Thread.sleep(3000);
		 WebElement elehome=driver.findElement(By.xpath("(//img)[1]"));
			 String strUr18 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr18);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(elehome).click().perform();
			 
			 Thread.sleep(3000);
		 WebElement eleCarticon=driver.findElement(By.xpath("//div[@class='cart showindis ng-star-inserted']"));
			 String strUr19 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr19);
		     System.out.println("Page title is : " + driver.getTitle());
		     
			 action.moveToElement(eleCarticon).click().perform();
			 
			 Thread.sleep(3000);
		 WebElement eleok=driver.findElement(By.xpath("//span[text()=' OK ']"));
			 String strUr20 = driver.getCurrentUrl();
		     System.out.println("Current Url is:"+ strUr20);
		     System.out.println("Page title is : " + driver.getTitle());
		     
		     action.moveToElement(eleok).click().perform();
			 		
	     driver.quit();

	}

}
