package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addressform_page {
	public Addressform_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "Office")
	private WebElement officeRB;
	
	@FindBy(id = "Name")
	private WebElement nameTextfield;
	
	
	@FindBy(id = "House/Office Info")
	private WebElement houseTextfield;
	
	@FindBy(id = "Street Info")
	private WebElement streetTextfield;
	
	@FindBy(id = "Landmark")
	private WebElement landmarkTextfield;
	
	@FindBy(id = "Country")
	private WebElement countryDropdown;
	
	@FindBy(id = "State")
	private WebElement stateDropdown;
	
	@FindBy(id = "City")
	private WebElement cityDropdown;
	
	@FindBy(id ="Pincode")
	private WebElement pincodeTextfield;
	
	@FindBy(id = "Phone Number")
	private WebElement phonenumbertextfield;
	
	@FindBy(id = "addAddress")
	private WebElement addressbtn;

	public WebElement getOfficeRB() {
		return officeRB;
	}

	public WebElement getNameTextfield() {
		return nameTextfield;
	}

	public WebElement getHouseTextfield() {
		return houseTextfield;
	}

	public WebElement getStreetTextfield() {
		return streetTextfield;
	}

	public WebElement getLandmarkTextfield() {
		return landmarkTextfield;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebElement getPincodeTextfield() {
		return pincodeTextfield;
	}

	public WebElement getPhonenumbertextfield() {
		return phonenumbertextfield;
	}

	public WebElement getAddressbtn() {
		return addressbtn;
	}

	

}

