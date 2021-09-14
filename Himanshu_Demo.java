package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Himanshu_Demo {

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
			  WebElement option=dropdownselectByIndex.getFirstSelectedOption();
              //dropdownselectByIndex.selectByIndex((int) 10.); 
			  System.out.println(option.getText());
			  Thread.sleep(2000); 
			  
			  //Verify the dropdown is enabled and visible. 
			  
			
  
			if(option.getText().equals("18. Greece"))
			{ 
				
			System.out.println("Pass");   
			   } 
			  else 
			  { 
			      System.out.println("Fail"); 
			
			      js.executeScript("window.scrollBy(0,900)");
			      driver.quit();
	}

}}
