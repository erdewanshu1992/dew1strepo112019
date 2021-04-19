package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YM_Login {
	WebDriver driver;
	JavascriptExecutor scroll;
	@BeforeMethod
	public void YMTesting() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.yesmadam.com/welcome");
	//For Scroll Down and UP
	   scroll = (JavascriptExecutor) driver;
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//*[@id=\"loginSignup\"]")).click();
	//driver.findElement(By.xpath("/html/body/app-root/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/input")).sendKeys("7011565023");
	//driver.findElement(By.xpath("/html/body/app-root/app-pages/div/app-header/div[1]/div/div/div/div[1]/div/form/button")).click();
	//Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div")).click();
	Thread.sleep(3000);
	}
	@Test(priority=2)
	public void Appointment() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[5]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	System.out.println("My Appointment");
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/my-appointments");

	}
	@Test(priority=1)
	public void Profile() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[6]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/my-profile");
	   }
	@Test(priority=3)
	public void Wallet() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[7]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/my-wallet");
	}
	@Test(priority=4)
	public void RAFriend() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[9]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"body_top\"]/app-root/app-pages/div/app-header/div[1]/div/div/div/span/i")).click();
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/refer-a-friend");
	}
	@Test(priority=5)
	public void Sanitization() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[2]/div/ul/li[3]/a")).click();
	System.out.println("Sanitization");
	    System.out.println("Page title is : " + driver.getTitle());
	        String strUrl3 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl3);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/sanitization");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,5000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=6)
	public void Donate() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
	System.out.println("Donate");
	   System.out.println("Page title is : " + driver.getTitle());
	   String strUrl1 = driver.getCurrentUrl();
	   System.out.println("Current Url is:"+ strUrl1);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/donate-now");
	   System.out.println("----");
	   scroll.executeScript("window.scrollBy(0,5000)", "");
	   scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=7)
	public void TeamOfPicassos() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[10]/a")).click();
	    System.out.println("Page title is : " + driver.getTitle());
	        String strUrl4 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl4);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/our-team");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,8000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=8)
	public void Franchise() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[11]/a")).click();
	        System.out.println("Page title is : " + driver.getTitle());
	        String strUrl5 = driver.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl5);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/franchise");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,4000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	}
	@Test(priority=9)
	public void PrivacyPolicy() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[12]/a")).click();
	     System.out.println("Page title is : " + driver.getTitle());
	     String strUrl6 = driver.getCurrentUrl();
	     System.out.println("Current Url is:"+ strUrl6);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/privacy-policy");
	     System.out.println("----");
	     scroll.executeScript("window.scrollBy(0,8000)", "");
	     scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=10)
	public void FAQs() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[13]/a")).click();
	     System.out.println("Page title is : " + driver.getTitle());
	     String strUrl7 = driver.getCurrentUrl();
	     System.out.println("Current Url is:"+ strUrl7);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/faqs");
	     System.out.println("----");
	     scroll.executeScript("window.scrollBy(0,9000)", "");
	     scroll.executeScript("window.scrollBy(0,-350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=11)
	public void ContactUS() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[14]/a")).click();
	   System.out.println("Page title is : " + driver.getTitle());
	String strUrl8 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl8);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/contact-us");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,9000)", "");
	scroll.executeScript("window.scrollBy(0,-3550)", "");
	Thread.sleep(3000);
	}
	@Test(priority=12)
	public void AboutUS() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[16]/a")).click();
	   System.out.println("Page title is : " + driver.getTitle());
	String strUrl9 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl9);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/about-us");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,8000)", "");
	scroll.executeScript("window.scrollBy(0,-3350)", "");
	   Thread.sleep(3000);
	}
	@Test(priority=13)
	public void HaderDonate() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl10 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl10);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/donate-now");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-2350)", "");
	Thread.sleep(3000);
	}
	@Test(priority=14)
	public void HeaderBlog() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[3]/a")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl12 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl12);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://yesmadam.com/blog/");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-3350)", "");
	   driver.navigate().back();
	Thread.sleep(3000);
	}
	@Test(priority=15)
	public void HeaderFranchise() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[4]")).click();
	System.out.println("Page title is : " + driver.getTitle());
	String strUrl13 = driver.getCurrentUrl();
	System.out.println("Current Url is:"+ strUrl13);
	AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/franchise");
	System.out.println("----");
	scroll.executeScript("window.scrollBy(0,4000)", "");
	scroll.executeScript("window.scrollBy(0,-2350)", "");
	Thread.sleep(3000);
	}

	@AfterMethod
	public void quit() {
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/welcome");
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/sanitization");
	//Assert.assertEquals(driver.getCurrentUrl(), "https://www.yesmadam.com/welcome");


	driver.quit();
	}
}
