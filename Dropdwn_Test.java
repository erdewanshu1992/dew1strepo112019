package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn_Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///home/yesmadam/Reg.html");

		 driver.findElement(By.xpath("/html/body/div/div[9]/form/p[1]/input")).sendKeys("Dewanshu");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/input[1]")).sendKeys("DEV");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/input[2]")).sendKeys("7011565023");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/p[4]/input")).sendKeys("12345");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/input[3]")).sendKeys("12345");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/p[7]/input")).sendKeys("Rajkumar Yadav");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/p[9]/input")).sendKeys("Rita Devi");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/input[4]")).sendKeys("AT- Kushaha, POST- Banitpur");
		 driver.findElement(By.xpath("/html/body/div/div[9]/form/input[5]")).sendKeys("Supaul");
			 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,1550)", "");
		 //js.executeScript("arguments[0].scrollIntoView();", Element);
		 //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     //js.executeScript("window.scrollBy(0,1000)");
	     //Thread.sleep(2000);
		 // This  will scroll down the page by  200 pixel vertical
		 js.executeScript("window.scrollBy(0,200)");


	     //Using Select class for selecting value from dropdown  

		 Select dropdownselectByVisibleText = new Select(driver.findElement(By.id("testingDropdown")));
		 dropdownselectByVisibleText.selectByVisibleText("4. Database Testing"); 
		 Thread.sleep(2000);
		 System.out.println("Database");
		 
		 Select dropdownselectByVisibleText2 = new Select(driver.findElement(By.id("countryDropdown")));
		 dropdownselectByVisibleText2.selectByVisibleText("18. Greece"); 
		 Thread.sleep(2000);
		 System.out.println("Greece");
		 
		 Select dropdownselectByIndex = new Select(driver.findElement(By.id("countryDropdown")));
	     dropdownselectByIndex.selectByIndex((int) 10.); 
	     Thread.sleep(2000); 
		
	     //Verify the dropdown is enabled and visible. 
			
		    String Country = "Cuba";
//		    if("Cuba" == "cuba")
			if(Country == "cuba")
			{ 
				
			System.out.println("Pass");   
			   } 
			  else 
			  { 
			System.out.println("Fail"); 
			    
			/*
			  //declaring and initializing a with 10
			  int a=10; 
			  if(a==10) {
				  
			  //Will get executed only when the condition is true.
				  
			  System.out.println("cuba");	}
			
			  else { 
				  
			  System.out.println("Fail"); 
			
*/
				/*
				 * Select dropdownselectByValue = new
				 * Select(driver.findElement(By.id("testingDropdown")));
				 * dropdownselectByValue.selectByValue("Manual Testing"); Thread.sleep(2000);
				 * System.out.println("Manual");
				 */
			
			// This  will scroll down the page by  9000 pixel vertical
			js.executeScript("window.scrollBy(0,900)");
	        Thread.sleep(2000);
	}

	}
			
	}
