package ecommercewebsite;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class tillTwentyTest extends Base {
	
	tillTen u2;
	tillFifteen u3;
	tillTwenty u4;
	
	@Test(priority = 16) 
	public void TC16() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u.verifyHomepage();
		{	u.clickSignupLogin();
		u.Signup("siri", "siri112@gmail.com");
			u3.fillDetailsSignup();
			u3.verifyAccCreatedClickContinue();
			u.clickLogout();
		}
		u.clickSignupLogin();
		u.Login("siri@gmail.com","siri1234");
		u.verifyLoginAs();
		u2.clickProductsTab();
		u3.clickAddToCart1();
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
	
	@Test(priority = 17) 
	public void TC17() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u.verifyHomepage();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickAddToCart2();
		u3.clickContinueShopping();
		u3.clickCartTab();
		u3.verifyCartPage();
		u4.ClickXremoveProd();
		u4.verifyProductisRemoved();
	}
	
	@Test(priority = 18) 
	public void TC18() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u4.verifyCategory();
		u4.ClickTopInWoman();
		u4.verifyTopInWoman();
		u4.ClickTshirtInMen();
		u4.verifyTshirtInMen();
	}
	
	@Test(priority = 19) 
	public void TC19() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u4.verifyBrands();
		u4.clickAndVerifyPoloBrands();
		u4.clickAndVerifyHandMBrands();
	}
	
	@Test(priority = 20) 
	public void TC20() {
		u = new tillFive(driver);
		u2 = new tillTen(driver);
		u3 = new tillFifteen(driver);
		u4 = new tillTwenty(driver);
		u.verifyHomepage();
		u2.clickProductsTab();
		u2.verifyAllProductPage();
		u2.typeProductandClick("Top");
		u2.verifySearchedProduct();
		u2.verifyRelatedToSearch();
		u3.clickAddToCart1();
		u3.clickContinueShopping();
		u3.clickCartTab();
		u4.verifyProductInCart();
		u.clickSignupLogin();
		u.Login("siri@gmail.com","siri1234");
		u3.clickCartTab();
		u4.verifyProductInCart();
	}

}