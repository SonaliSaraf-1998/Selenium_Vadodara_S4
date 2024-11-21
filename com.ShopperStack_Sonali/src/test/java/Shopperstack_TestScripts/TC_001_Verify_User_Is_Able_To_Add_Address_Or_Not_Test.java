package Shopperstack_TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShopperStack_POM.Addressform_page;
import com.ShopperStack_POM.Home_page;
import com.ShopperStack_POM.MyAddress_Page;
import com.ShopperStack_POM.MyProfile_Page;

import Shopperstack_GenericUtility.Base_Test;


public class TC_001_Verify_User_Is_Able_To_Add_Address_Or_Not_Test extends Base_Test {
	@Test
public void addAdress()throws InterruptedException,EncryptedDocumentException,IOException  {
	Thread.sleep(2000);
	homePage.getAccountSettingsBtn().click();
	homePage.getMyProfileBtn().click();
	
	MyProfile_Page myProfilePage = new MyProfile_Page(driver);
	myProfilePage.getMyAddresseBtn().click();
	
	Thread.sleep(2000);
	MyAddress_Page myAddress_Page = new MyAddress_Page(driver);
	myAddress_Page.getAddAddressBtn().click();
	
	Addressform_page addressFormPage = new Addressform_page(driver);
	
	
	
	addressFormPage.getOfficeRB().click();
	addressFormPage.getNameTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
	addressFormPage.getHouseTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));
	
	addressFormPage.getStreetTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
	addressFormPage.getLandmarkTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
	webDriverUtility.selectByValue(addressFormPage.getCountryDropdown(), fileUtility.readPropertyFile("country"));
	
	
	webDriverUtility.selectByValue(addressFormPage.getStateDropdown(), fileUtility.readPropertyFile("state"));
	
	webDriverUtility.selectByValue(addressFormPage.getCityDropdown(), fileUtility.readPropertyFile("city"));
	addressFormPage.getPincodeTextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));
	
	addressFormPage.getPhonenumbertextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
	addressFormPage.getAddressbtn().click();
	
}}



	
	
	
			
	
	