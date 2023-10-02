package ecommercewebsite;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class tillFifteenTest extends Base{
	tillTen u2;
	tillFifteen u3;
	
	@Test(priority = 11)
	public void TC11() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u.verifyHomepage();
		u3.clickCartTab();
		u3.scrollDownToFooterCart();
		u2.verifySubscription();
		u2.typeSubscriptionEmailandClick("siri@gmail.com");
		u2.verifySubscriptionSuccessfull();
	}

	@Test(priority = 12)
	public void TC12() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickAddToCart2();
		u3.clickViewCart();
		u3.verifyProductInCart();
		u3.verifyPriceQuantTotalInCart();	
	}
	
	@Test(priority = 13)
	public void TC13() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u.verifyHomepage();
		u3.clickViewProduct2();
		u3.verifyProductDetails();
		u3.increaseQuantityTo4("4");
		u3.clickAddToCartAftProduct();
		u3.clickViewCart();
		u3.verifyQuantity4();
	}
	
	@Test(priority = 14) 
	public void TC14() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u.verifyHomepage();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickAddToCart2();
		u3.clickContinueShopping();
		u3.clickCartTab();
		u3.verifyCartPage();
		u3.clickProceedToChecko();
		u3.clickRegORLogin();
		u.Signup("siri", "siri112@gmail.com");
		u3.fillDetailsSignup();
		u3.verifyAccCreatedClickContinue();
		u.verifyLoginAs();
		u3.clickCartTab();
		u3.clickProceedToChecko();
		u3.verifyAddressReviewOrder();
		u3.typeDescriptnClickPlaceOrder("xyz, xyz122.");
		u3.typePaymentDetails("siri", "7788996655", "445"," 98", "2020");
		u3.clickPayAndConfirm();
		u3.verifyOrderPlacedsuccess();
		u.clickDeleteAcc();
		u.verifyAccDel();
	}
	
	@Test(priority = 15) 
	public void TC15() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
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
		u.clickDeleteAcc();
		u.verifyAccDel();
	}
}
