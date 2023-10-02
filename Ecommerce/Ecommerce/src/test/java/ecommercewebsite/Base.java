package ecommercewebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	 WebDriver driver;
	 tillFive u;
	 
	 
	 @BeforeMethod
		public void startBrowser() throws Exception {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Selenium_jars\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://automationexercise.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
}