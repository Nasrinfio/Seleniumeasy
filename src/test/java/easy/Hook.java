package easy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	 @Before
	 public static void chromedriverinit() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Project\\Seleniumeasy\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Hook.driver.manage().window().maximize();	
	 }
	 
	 @After
	 public static void driverclose() {
		driver.close();
	 }

}
