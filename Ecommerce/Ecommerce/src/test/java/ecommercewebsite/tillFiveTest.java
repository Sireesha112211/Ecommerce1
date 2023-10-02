package ecommercewebsite;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;import javax.xml.xpath.XPath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class tillFiveTest extends Base{
	
	@Test(priority = 1)
	public void TC1() throws Exception{
		u = new tillFive(driver);
		
		u.verifyHomepage();
		u.clickSignupLogin();
		u.verifySignup();
		u.Signup("siri", "siri112@gmail.com");
		boolean enterAccInfo = u.EAccInfo.isDisplayed();
		SoftAssert s2 = new SoftAssert();
		s2.assertEquals(enterAccInfo, true);
		driver.findElement(By.id("password")).sendKeys("siri1234");
		WebElement day = driver.findElement(By.id("days"));
		Select obj1 = new Select(day);
		obj1.selectByValue("2");
		WebElement month = driver.findElement(By.id("months"));
		Select obj2 = new Select(month);
		obj2.selectByVisibleText("June");
		WebElement year = driver.findElement(By.id("years"));
		Select obj3 = new Select(year);
		obj3.selectByVisibleText("1993");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("first_name")).sendKeys("siri");
		driver.findElement(By.id("last_name")).sendKeys("reddy");
		driver.findElement(By.id("company")).sendKeys("ExcelR");
		driver.findElement(By.id("address1")).sendKeys("Nivas Building");
		driver.findElement(By.id("address2")).sendKeys("Apartment");
		WebElement country = driver.findElement(By.id("country"));
		Select obj4 = new Select(country);
		obj4.selectByVisibleText("India");
		driver.findElement(By.id("state")).sendKeys("Maharashtra");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("zipcode")).sendKeys("411036");
		driver.findElement(By.id("mobile_number")).sendKeys("7788996655");
		driver.findElement(By.xpath("//button[text()='Create Account']")).click();
		boolean accCreated = driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
		SoftAssert s3 = new SoftAssert();
		s3.assertEquals(accCreated, true);
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		u.verifyLoginAs();
		u.clickDeleteAcc();
		u.verifyAccDel();
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}
	
	@Test(priority = 2)
	public void TC2() {
		u = new tillFive(driver);
		u.clickSignupLogin();
		{
			u.createAccandLogout();
		}
		u.clickSignupLogin();
		u.Login("siri@gmail.com","siri1234");
		u.verifyLoginAs();
		u.clickDeleteAcc();
		u.verifyAccDel();
	}
	
	@Test(priority = 3)
	public void TC3() {
		u = new tillFive(driver);
		u.verifyHomepage();
		u.clickSignupLogin();
		u.verifyLogintoAcc();
		u.Login("siri@gmail.com","siri1234");
		u.verifyIncorrectAlert();
	}
	
	@Test(priority = 4)
	public void TC4() {
		u = new tillFive(driver);
		u.verifyHomepage();
		u.clickSignupLogin();
		u.verifyLogintoAcc();
		u.Login("siri@gmail.com","siri1234");
		u.verifyLoginAs();
		u.clickLogout();
		boolean loginPage = u.loginAccH2.isDisplayed();
		SoftAssert s = new SoftAssert();
		s.assertEquals(loginPage, true);	
	}
	
	@Test(priority = 5)
	public void TC5() {
		u = new tillFive(driver);
		u.verifyHomepage();
		u.clickSignupLogin();
		u.verifySignup();
		u.Signup("siri", "siri112@gmail.com");
		u.verifyemailExistAlert();
	}

}
