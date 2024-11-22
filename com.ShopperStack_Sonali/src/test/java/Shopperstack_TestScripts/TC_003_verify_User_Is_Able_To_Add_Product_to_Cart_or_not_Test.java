package Shopperstack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopperStack_POM.Cart_Page;
import com.ShopperStack_POM.Delivery_AddressPage;
import com.ShopperStack_POM.Payment_Page;

import Shopperstack_GenericUtility.Base_Test;

public class TC_003_verify_User_Is_Able_To_Add_Product_to_Cart_or_not_Test extends Base_Test {

	@Test
	public void orderProduct() throws InterruptedException, IOException {

		Thread.sleep(3000);
		webDriverUtility.javaScript(driver, homePage.getFeaturedProduct());
		Thread.sleep(3000);
		homePage.getaddTocartBtn().click();
		homePage.getcartBtn().click();
		Thread.sleep(3000);

		Cart_Page cart_Page = new Cart_Page(driver);
		cart_Page.getByNOWBtn().click();

		Delivery_AddressPage addressPage = new Delivery_AddressPage(driver);
		addressPage.getAddressRB().click();
		Thread.sleep(1000);
		webDriverUtility.javaScript(driver, addressPage.getProceedBtn());
		addressPage.getProceedBtn().click();

		Payment_Page payment_Page = new Payment_Page(driver);
		webDriverUtility.scrollToelement(driver, payment_Page.getCod());
		Thread.sleep(2000);
		payment_Page.getCod().click();
		payment_Page.getProceedBtn().click();
		Thread.sleep(3000);
		webDriverUtility.webPageScreenShot(driver);
		Thread.sleep(7000);
	}
}
