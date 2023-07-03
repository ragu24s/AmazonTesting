package com.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderProducts {

	public WebDriver driver;
	 
	@FindAll({
		@FindBy(xpath ="//input[@placeholder='Search Amazon.in']")
			})
       private WebElement search;
	@FindAll({
		@FindBy(id ="nav-search-submit-button")
			})
       private WebElement Clicksearch;
	@FindAll({
   		@FindBy(xpath ="//span[text()='Apple iPhone 14 Pro (256 GB) - Deep Purple']")
		})
  private WebElement clickPhone;
	@FindAll({
		@FindBy(xpath ="(//img[@class='imgSwatch'])[3]")
	})
private WebElement clickColour;
	
	@FindAll({
		@FindBy(xpath ="//input[@title='Add to Shopping Cart']")
	})
private WebElement clickAddtocart;
	@FindAll({
		@FindBy(xpath ="//p[text()='512 GB']")
			})
       private WebElement clickram;
     
	@FindAll({
	@FindBy(xpath ="//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")
					})
		       private WebElement clickaddtocart1;
	@FindAll({
		@FindBy( xpath ="//span[@class='nav-cart-icon nav-sprite']")
	})
private WebElement clickcart;
	@FindAll({
		@FindBy(id ="searchDropdownBox")
			})
       private WebElement selectcomputer;
	@FindAll({
		@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	})
private WebElement click1;
	
	@FindAll({
		@FindBy(xpath="(//span[text()='Laptops'])[1]")
	})
private WebElement clicklatops;
	
	@FindAll({
		@FindBy(xpath="(//span[text()='Apple'])[2]")
	})
private WebElement clickApllelap;
	
	@FindAll({
		@FindBy(xpath="(//h2[contains(@class,'a-size-mini a-spacing-none')])[1]")
	})
private WebElement clickApllemodel;
	
	@FindAll({
		@FindBy(xpath="//a[@class='a-link-normal close-button']")
	})
private WebElement clickXmark;
	@FindAll({
		@FindBy(xpath="(//span[contains(@class,'a-size-medium a-color-base')])[1]")
	})
private WebElement clickTvandAcess;
	
	@FindAll({
		@FindBy(xpath="//input[@value='Add to Cart']")
	})
private WebElement clickTvmodel;
	
	@FindAll({
		@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	})
private WebElement clickBuy;
	
	
	


	
	

	@FindAll({
		@FindBy(xpath ="(//h2[contains(@class,'a-size-mini a-spacing-none')])[1]")
	})
	
private WebElement clickEarphone;

	@FindAll({
		@FindBy(xpath ="(//img[@class='imgSwatch'])[3]")
	})
private WebElement clickearphonecolour;
	
	@FindAll({
		@FindBy(id ="add-to-cart-button")
	})
private WebElement earphoneaddtocart;

	public OrderProducts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClicksearch() {
		return Clicksearch;
	}

	public WebElement getClickPhone() {
		return clickPhone;
	}

	public WebElement getClickColour() {
		return clickColour;
	}
	public WebElement getClickram() {
		return clickram;
	}
	public WebElement getClickaddtocart1() {
		return clickaddtocart1;
	}
	public WebElement getClickAddtocart() {
		return clickAddtocart;
	}

	public WebElement getSelectcomputer() {
		return selectcomputer;
	}

	public WebElement getClickEarphone() {
		return clickEarphone;
	}

	public WebElement getClickearphonecolour() {
		return clickearphonecolour;
	}

	public WebElement getEarphoneaddtocart() {
		return earphoneaddtocart;
	}
	
	public WebElement getClickcart() {
		return clickcart;
	}

	public WebElement getClicklatops() {
		return clicklatops;
	}

	public WebElement getClick1() {
		return click1;
	}
	public WebElement getClickApllelap() {
		return clickApllelap;
	}
	
	public WebElement getClickApllemodel() {
		return clickApllemodel;
	}

	public WebElement getClickXmark() {
		return clickXmark;
	}

	public WebElement getClickTvandAcess() {
		return clickTvandAcess;
	}

	public WebElement getClickTvmodel() {
		return clickTvmodel;
	}
	public WebElement getClickBuy() {
		return clickBuy;
	}
}
