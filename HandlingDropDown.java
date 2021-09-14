package inetBankingV1;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropDown {

	/**
	 * class description
	 */
	 	       WebDriver driver;
	 
	       /**
	        * Set up browser settings and open the application
	        */
	 
	       @Before
	       public void setUp() {
	              driver=new ChromeDriver();
	              
	// Opened the application
	              driver.get("home\\yesmadam\\TestNG.html");
	              driver.manage().window().maximize();
	       }
	 
	       /**
	        * Test to select the dropdown values
	        * @throws InterruptedException
	        */
	 
	       @Test
	       public void testSelectFunctionality() throws InterruptedException { 
	              
	// Go to google
	              driver.findElement(By.linkText("Google")).click();
	              
	// navigate back to previous webpage
	              driver.navigate().back();
	              Thread.sleep(5000);
	              
	// select the first operator using "select by value"
	              Select selectByValue = new Select(driver.findElement(By.id("SelectID_One")));
	              selectByValue.selectByValue("greenvalue");
	              Thread.sleep(5000);
	              
	// select the second dropdown using "select by visible text"
	              Select selectByVisibleText = new Select (driver.findElement(By.id("SelectID_Two")));
	              selectByVisibleText.selectByVisibleText("Lime");
	              Thread.sleep(5000);
	              
	// select the third dropdown using "select by index"
	              Select selectByIndex = new Select(driver.findElement(By.id("SelectID_Three")));
	              selectByIndex.selectByIndex(2);
	              Thread.sleep(5000);       
	       }
	 
	       /**
	        * Tear down the setup after test completes
	        */
	 
	       @After
	       public void tearDown() { 
	              driver.quit();
}
	       }
