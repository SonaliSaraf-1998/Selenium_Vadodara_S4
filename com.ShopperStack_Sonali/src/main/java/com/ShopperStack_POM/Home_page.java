package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
		
	@FindBy(xpath="//span[contains(@class,'BaseBadge-badge')]")
	private WebElement accountSettingsBtn;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileBtn;
	
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logOutBtn;
	
	public WebElement getAccountSettingsBtn() {
		return accountSettingsBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public WebElement getMyProfileBtn() {
		return myProfileBtn;
	}
	@FindBy(id="cart")
	private WebElement cartBtn;
	
	public WebElement getcartBtn() {
		return cartBtn;
	}
	
	
	@FindBy(xpath="//h1[text()='Featured Products']")
	private WebElement featuredProduct;
	
	
	public WebElement getFeaturedProduct() {
		return featuredProduct;
	}
		
		@FindBy(xpath= "(//button[text()='add to cart'])[1]")
		private WebElement addToCartBtn;
		
		
		public WebElement getaddTocartBtn() {
		return addToCartBtn;
		
	}
}
	


