package Demos;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeSnapshot {

	private static Object oImageFile;

	public static void main( String sImageFilename) {

		try {
			TakesScreenshot camera;
			File tmpFile, imageFile;

			imageFile = new File(sImageFilename);

			if( new File(sImageFilename).exists()){
			throw new Exception("File already exists..");
			}

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			camera= (TakesScreenshot) driver;

			tmpFile = camera.getScreenshotAs(OutputType.FILE);

			Object FileUtils;
			((Object) FileUtils).copyFile(tmpFile, oImageFile);

			} 
		
		    catch (Exception e) {
			e.printStackTrace();
	}

}
}