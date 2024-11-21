package com.ShopperStack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="buynow_fl")
	private WebElement buyNowBtn;
	
	public WebElement getByNOWBtn() {
		return buyNowBtn;
		
	}
	
}


