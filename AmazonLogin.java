package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\erdew\\Desktop\\Seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Actions action = new Actions(driver);
		WebElement eleSamsung = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none _multi-card-creative-desktop_ImageContainer_container__3u7mk _multi-card-creative-desktop_Layout_block__pSInq _multi-card-creative-desktop_Layout_hFull__3JKWp _multi-card-creative-desktop_Layout_wFull__3joZ5 _multi-card-creative-desktop_Layout_row__3sic1 _multi-card-creative-desktop_Layout_itemsCenter__DDsI_ _multi-card-creative-desktop_Layout_contentCenter__1Pb0I']"));
		action.moveToElement(eleSamsung).click().perform();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hlb-ptc-btn-native\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("tutu221988@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("qwerty@123");
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();

	}

}
