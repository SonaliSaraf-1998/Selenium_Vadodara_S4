package Shopperstack_TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShopperStack_POM.Home_page;
import com.ShopperStack_POM.MyAddress_Page;
import com.ShopperStack_POM.MyProfile_Page;

import Shopperstack_GenericUtility.Base_Test;

public class TC_002_Verify_user_is_able_to_deleteAddress_or_not_Test extends Base_Test {
	
	@Test
	
	public void deleteAddress() throws InterruptedException, IOException {
		
		homePage.getAccountSettingsBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfile_Page myProfile_Page = new MyProfile_Page(driver);
		myProfile_Page.getMyAddresseBtn().click();
		
		Thread.sleep(2000);
		MyAddress_Page myAddress_Page = new MyAddress_Page(driver);
		myAddress_Page.getDeleteBtn().click();
		Thread.sleep(2000);
		myAddress_Page.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);
		
		
	}
	
	

}
