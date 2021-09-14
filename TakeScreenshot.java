package chapter1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakeScreenshot {
    WebDriver driver;

    @ BeforeClass
    public void setUp() throws Exception {
    	
    driver = new ChromeDriver();
    driver.get("https://google.com");

    Thread.sleep(2000);
}

    @AfterClass
    public void tearDown() throws Exception {
    driver.quit();
    }

    @ Test
    public void test() throws IOException {

    // Capture the screenshot
    File scrFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);

    // Code for pasting screenshot to a user-specified location
    FileUtils.copyFile(scrFile, new File("home\\yesmadam\\Downloads\\wellness.png")); 

}

	private File getScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub
		return null;
	}}
