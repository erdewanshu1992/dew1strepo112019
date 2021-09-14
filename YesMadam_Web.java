package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class YesMadam_Web {

	public static void main(String[] args) throws InterruptedException {

		WebDriver YesMadamWeb = new ChromeDriver();
		YesMadamWeb.get("https://www.yesmadam.com/welcome");
		//For Scroll Down and UP
	    JavascriptExecutor scroll = (JavascriptExecutor) YesMadamWeb;
        YesMadamWeb.manage().window().maximize();
            //Page Title
	        System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrl = YesMadamWeb.getCurrentUrl();
	        //For Current URL
	        System.out.println("Current Url is:"+ strUrl);
	        System.out.println("----");
	      //For Scroll Down and UP
	        scroll.executeScript("window.scrollBy(0,8000)", "");
	        scroll.executeScript("window.scrollBy(0,-6050)", "");
	    Thread.sleep(2000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Blog
	   YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[2]/a")).click();
	        System.out.println("Page title is : " + YesMadamWeb.getTitle());
		    String strUrlOut = YesMadamWeb.getCurrentUrl();
		    System.out.println("Current Url is:"+ strUrlOut);
		    System.out.println("----");
		    //For Scrolling Down And Up
		    scroll.executeScript("window.scrollBy(0,6000)", "");
		    scroll.executeScript("window.scrollBy(0,-3350)", "");
		    Thread.sleep(4000);
		//Blog beauty
		YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[1]/span/a")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrlBeauty = YesMadamWeb.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrlBeauty);
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,6000)", "");
	        scroll.executeScript("window.scrollBy(0,-2350)", "");
	        Thread.sleep(3000);
	     YesMadamWeb.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[2]/div/div/a[1]/img")).click();
	        System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrlhairB = YesMadamWeb.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrlhairB);
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,6000)", "");
	        scroll.executeScript("window.scrollBy(0,-5350)", "");
	        Thread.sleep(4000);
		//Blog Hair
		YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[2]/span/a")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
		    String strUrlhair = YesMadamWeb.getCurrentUrl();
		    System.out.println("Current Url is:"+ strUrlhair);
		    System.out.println("----");
		    scroll.executeScript("window.scrollBy(0,3000)", "");
		    scroll.executeScript("window.scrollBy(0,-350)", "");
		YesMadamWeb.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[1]/div/div/a[1]/img")).click();
		   System.out.println("Page title is : " + YesMadamWeb.getTitle());
	       String strUrlhairH = YesMadamWeb.getCurrentUrl();
	       System.out.println("Current Url is:"+ strUrlhairH);
	       System.out.println("----");
	       scroll.executeScript("window.scrollBy(0,6000)", "");
	       scroll.executeScript("window.scrollBy(0,-5350)", "");
		    Thread.sleep(3000);
		    YesMadamWeb.navigate().back();

		 YesMadamWeb.findElement(By.xpath("//*[@id=\"post-30\"]/div/div[1]/a[1]/img")).click();
		 
		    Thread.sleep(3000);
		 //Blog waxing
		 YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[3]/span/a")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrlwaxing = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrlwaxing);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,8000)", "");
			scroll.executeScript("window.scrollBy(0,-350)", "");
			Thread.sleep(4000);
	     //Blog Grooming
		 YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[4]/span/a")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrlGrooming = YesMadamWeb.getCurrentUrl();
		    System.out.println("Current Url is:"+ strUrlGrooming);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,8000)", "");
		    scroll.executeScript("window.scrollBy(0,-350)", "");
			Thread.sleep(4000);
		  //Blog Male Spa
		  YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[5]/span/a")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrlMalespa = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrlMalespa);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,8000)", "");
			scroll.executeScript("window.scrollBy(0,-350)", "");
		    Thread.sleep(4000);
		  //Blog Female Spa
		  YesMadamWeb.findElement(By.xpath("//*[@id=\"nav-header\"]/li[6]/span/a")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrlFemalespa = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrlFemalespa);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,8000)", "");
			scroll.executeScript("window.scrollBy(0,-350)", "");
			Thread.sleep(4000);
			//YesMadamWeb.navigate().back();
			//YesMadamWeb.navigate().refresh();
			Thread.sleep(2000);
		YesMadamWeb.get("https://www.yesmadam.com/welcome");
        YesMadamWeb.manage().window().maximize();
        Thread.sleep(2000);
		
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Sanitization
	    YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div[1]/div[2]/div/ul/li[3]/a")).click();
	    	System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrl3 = YesMadamWeb.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl3);
			//Assert.assertEquals(YesMadamWeb.getCurrentUrl(), "https://www.yesmadam.com/sanitization");
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,5000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Donate
	    YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
		    String strUrl1 = YesMadamWeb.getCurrentUrl();
		    System.out.println("Current Url is:"+ strUrl1);
		    System.out.println("----");
		    scroll.executeScript("window.scrollBy(0,5000)", "");
		    scroll.executeScript("window.scrollBy(0,-350)", "");
		    Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Team Of Picassos
	    YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[10]/a")).click();
	    	System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrl4 = YesMadamWeb.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl4);
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,8000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Franchise
	    YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[11]/a")).click();
	        System.out.println("Page title is : " + YesMadamWeb.getTitle());
	        String strUrl5 = YesMadamWeb.getCurrentUrl();
	        System.out.println("Current Url is:"+ strUrl5);
	        System.out.println("----");
	        scroll.executeScript("window.scrollBy(0,4000)", "");
	        scroll.executeScript("window.scrollBy(0,-350)", "");
	        Thread.sleep(3000);
	 	YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
	 	//Privacy Policy
	 	YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[12]/a")).click();
	 	    System.out.println("Page title is : " + YesMadamWeb.getTitle());
	 	    String strUrl6 = YesMadamWeb.getCurrentUrl();
	 	    System.out.println("Current Url is:"+ strUrl6);
	 	    System.out.println("----");
	 	    scroll.executeScript("window.scrollBy(0,8000)", "");
	 	    scroll.executeScript("window.scrollBy(0,-350)", "");
		    Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//FAQs
	 	YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[13]/a")).click();
	 	    System.out.println("Page title is : " + YesMadamWeb.getTitle());
	 	    String strUrl7 = YesMadamWeb.getCurrentUrl();
	 	    System.out.println("Current Url is:"+ strUrl7);
	 	    System.out.println("----");
	 	    scroll.executeScript("window.scrollBy(0,9000)", "");
	 	    scroll.executeScript("window.scrollBy(0,-350)", "");
		    Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Contact US
		YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[14]/a")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
		 	String strUrl8 = YesMadamWeb.getCurrentUrl();
		 	System.out.println("Current Url is:"+ strUrl8);
		 	System.out.println("----");
		 	scroll.executeScript("window.scrollBy(0,9000)", "");
		 	scroll.executeScript("window.scrollBy(0,-3550)", "");
			Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//About US
		YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/div/div[2]/div/ul/li[16]/a")).click();
		    System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrl9 = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrl9);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,8000)", "");
			scroll.executeScript("window.scrollBy(0,-3350)", "");
		    Thread.sleep(3000);
		YesMadamWeb.findElement(By.xpath("//*[@id=\"hmbrgrMenu\"]/div/span[2]")).click();
		//Header Donate
	    YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[2]")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrl10 = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrl10);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,4000)", "");
			scroll.executeScript("window.scrollBy(0,-2350)", "");
			Thread.sleep(3000);
		//Header Blog
		YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[3]/a")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrl12 = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrl12);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,4000)", "");
			scroll.executeScript("window.scrollBy(0,-3350)", "");
		    YesMadamWeb.navigate().back();
			Thread.sleep(3000);
		//Header Franchise
		YesMadamWeb.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/div[2]/nav/ul/li[4]")).click();
			System.out.println("Page title is : " + YesMadamWeb.getTitle());
			String strUrl13 = YesMadamWeb.getCurrentUrl();
			System.out.println("Current Url is:"+ strUrl13);
			System.out.println("----");
			scroll.executeScript("window.scrollBy(0,4000)", "");
			scroll.executeScript("window.scrollBy(0,-2350)", "");
			Thread.sleep(3000);
			
			//YesMadamWeb.findElement(By.xpath("/html/body/app-root/app-pages/div/app-welcome/div/div[1]/section/div/div[2]/div[1]/img")).click();

			YesMadamWeb.quit();
	

	}

}
