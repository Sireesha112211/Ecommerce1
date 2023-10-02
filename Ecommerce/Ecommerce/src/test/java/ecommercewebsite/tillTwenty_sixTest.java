package ecommercewebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class tillTwenty_sixTest extends Base {
	tillTen u2;
	tillFifteen u3;
	tillTwenty u4;
	tillTwenty_six u5;

	
	@Test(priority = 21) 
	public void TC21() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u2.verifyAllProductPage();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(308,6000)");
		u2.clickView1st();
		u5.verifyReviewSection();
		u5.typeReview("excelR", "excelr@gmail.com", "Review for the Product");
		u5.clickSubmitReview();
		u5.verifySuccessofReview();
	}
	
	@Test(priority = 22) 
	public void TC22() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,7600)");
		u5.verifyRecomendedItems();
		u5.clickAddtoCRecom();
		u3.clickViewCart();
		u5.verifyProductInCart();
	}
	
	@Test(priority = 23) 
	public void TC23() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		u.verifyHomepage();
		u.clickSignupLogin();
		u.Signup("siri", "siri112@gmail.com");
		u3.fillDetailsSignup();
		u3.verifyAccCreatedClickContinue();
		u.verifyLoginAs();
		u2.clickProductsTab();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickAddToCart2();
		u3.clickContinueShopping();
		u3.clickCartTab();
		u3.verifyCartPage();
		u3.clickProceedToChecko();
		u3.verifyAddressReviewOrder();
		u5.compareDeliveryAddressWithRegisteredAddress();
		u5.compareBillingAddressWithRegisteredAddress();
		u.clickDeleteAcc();
		u.verifyAccDel();
	}
	
	@Test(priority = 24) 
	public void TC24() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		u.verifyHomepage();
		u.clickSignupLogin();
		u.Signup("siri", "siri112@gmail.com");
		u3.fillDetailsSignup();
		u3.verifyAccCreatedClickContinue();
		u.verifyLoginAs();
		u2.clickProductsTab();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickAddToCart2();
		u3.clickContinueShopping();
		u3.clickCartTab();
		u3.verifyCartPage();
		u3.clickProceedToChecko();
		u3.verifyAddressReviewOrder();
		u3.typeDescriptnClickPlaceOrder("xyz, xyz122.");
		u3.typePaymentDetails("siri", "7788996655", "445"," 98", "2020");
		u3.clickPayAndConfirm();
		u3.verifyOrderPlacedsuccess();
		u5.clickDownloadInvoice();
		u5.verifyInvoiceIsDownloaded();
		u5.clickContinueAftDownload();
		u.clickDeleteAcc();
		u.verifyAccDel();
	}
	
	@Test(priority = 25)
	public void TC25() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		u.verifyHomepage();
		u3.scrollDownToFooterCart();
		u2.verifySubscription();
		u5.clickScrollUpArrow();
		u5.verifyFullFledgeAtTop();
	}
	
	@Test(priority = 26)
	public void TC26() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u5 = new tillTwenty_six(driver);
		u.verifyHomepage();
		u3.scrollDownToFooterCart();
		u2.verifySubscription();
		u5.ScrollUpToTop();
		u5.verifyFullFledgeAtTop();
	}
}