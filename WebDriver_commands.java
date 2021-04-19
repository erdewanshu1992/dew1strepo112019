package Demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_commands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\geckodriver.exe");
	          
	        //Initialize Gecko Driver using Desired Capabilities Class  
	        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	        capabilities.setCapability("marionette",true);  
	        WebDriver driver= new FirefoxDriver(capabilities);  
	          
	     //Launch Website  
	     //driver.navigate().to("https://www.testandquiz.com/selenium/testing.html"); 
	        
	     driver.get("file:///C:/Users/erdew/Desktop/Demo_Page.html");
	      
	     //Fetch the text "This is sample text." and print it on console  
	     //Use the class name of the div to locate it and then fetch text using getText() method  
	     String sampleText = driver.findElement(By.className("col-md-12")).getText();  
	     System.out.println(sampleText);  
	          
	     //Use the linkText locator method to find the link and perform click using click() method  
	     driver.findElement(By.linkText("This is a link")).click();
	     Thread.sleep(3000);
	     
	     //To perform Scroll on application using Selenium
			JavascriptExecutor Yesmadam_Page = (JavascriptExecutor) driver;
			Yesmadam_Page.executeScript("window.scrollBy(0,9000)", "");
			
			String strUrYM = driver.getCurrentUrl();
		       System.out.println("Current Url is:"+ strUrYM);
		       System.out.println("Page title is : " + driver.getTitle());
		       
	     Thread.sleep(4000);
	     driver.navigate().back();
	     
	       String strUrDemo = driver.getCurrentUrl();
	       System.out.println("Current Url is:"+ strUrDemo);
	       System.out.println("Page title is : " + driver.getTitle());
	       
	       
	          // Click on the textbox and send value  
	     driver.findElement(By.id("fname")).sendKeys("Dewanshu");  
	       
	        // Clear the text written in the textbox  
	     driver.findElement(By.id("fname")).clear();  
	          
	        // Click on the Submit button using click() command  
	     driver.findElement(By.id("idOfButton")).click();  
	   
	        // Locate the radio button by id and check it using click() function  
	     driver.findElement(By.id("male")).click();  
	          
	        // Locate the checkbox by cssSelector and check it using click() function  
	     driver.findElement(By.cssSelector("input.Automation")).click();  
	              
	     //to perform Scroll on application using Selenium
		JavascriptExecutor Demo_Page = (JavascriptExecutor) driver;
		Demo_Page.executeScript("window.scrollBy(0,350)", "");
		    
		    
	    //Use Select class for selecting value from dropdown  
	    Select dropdown = new Select(driver.findElement(By.id("testingDropdown"))); 
	    Thread.sleep(1000);
	    dropdown.selectByVisibleText("Automation Testing");
	    //Thread.sleep(1000);
	    System.out.println("Automation Testing");
	    dropdown.selectByVisibleText("Database Testing"); 
	    //Thread.sleep(1000);
	    System.out.println("Database Testing");
	    dropdown.selectByVisibleText("Manual Testing"); 
	    //Thread.sleep(1000);
	    System.out.println("Manual Testing");
	    dropdown.selectByVisibleText("Performance Testing");
	    //Thread.sleep(1000);
	    System.out.println("Performance Testing");
	    
	    // doubleClick() method for double click to an element after moving to
	      //element to with the moveToElement()
	      Actions DoubleClick = new Actions(driver);
	              DoubleClick.moveToElement(driver.findElement(By.id("dblClkBtn"))).
	      doubleClick().
	      build().perform();
	      
	    //Handle Web based pop up
	              Alert alert = driver.switchTo().alert();
	              alert.accept();       

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
  	    System.out.println("generate Alert box");
	    Thread.sleep(2000);
	    
	    //Handle Web based pop up
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();   

	    driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
  	    System.out.println("generate Confirm box");
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 /*   
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", driver);
	    
	    //Drag and Drop operation is performed using the Action class.
	    
	    WebElement element = driver.findElement(By.xpath("//img[@alt='javatpoint']"));  
	    WebElement target = driver.findElement(By.xpath("//div[@ondragover='allowDrop(event)']"));  
	    
	    (new Actions(driver)).dragAndDrop(element, target).perform();  
	    
	    Thread.sleep(2000);
	        // Close the Browser  
	             //driver.close();  
	      */
	}

}
