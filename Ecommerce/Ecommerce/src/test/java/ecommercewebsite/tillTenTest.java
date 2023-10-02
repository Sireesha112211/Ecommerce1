package ecommercewebsite;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class tillTenTest extends Base {
	
	tillTen u2;
	
	@Test(priority = 6)
	public void TC6() throws InterruptedException, Exception {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u.verifyHomepage();
		u2.clickContactUs();
		u2.verifyInTouch();
		u2.fillContactUs("ExcelR", "excelr@gmail.com", "My last order", "Order not deliverd yet");
		u2.uploadFile("C:\\Users\\kandula\\eclipse-workspace\\Ecommerce\\src\\main\\java\\ecommercewebsite\\ContactUs");
		u2.clickSubmitContactUs();
		u2.clickAlertOK();
		u2.verifySuccessContactus();
		u2.homeFromContactUs();
	}
	
	@Test(priority = 7)
	public void TC7() throws InterruptedException, Exception {
		u= new tillFive(driver);
		u2 = new tillTen(driver);
		u.verifyHomepage();
		u2.clickTestCases();
		u2.verifyTCsVisible();
	}
	
	@Test(priority = 8)
	public void TC8() throws InterruptedException, Exception {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u2.verifyAllProductPage();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(308,6000)");
		u2.clickView1st();
		u2.verifyProductDetails();
	}
	
	@Test(priority = 9)
	public void TC9()  {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u2.verifyAllProductPage();
		u2.typeProductandClick("Winter Top");
		u2.verifyRelatedToSearch();
	}
	
	@Test(priority = 10)
	public void TC10()  {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u.verifyHomepage();
		u2.scrollDownToFooter();
		u2.verifySubscription();
		u2.typeSubscriptionEmailandClick("siri@gmail.com");
		u2.verifySubscriptionSuccessfull();
		
	}
	

}