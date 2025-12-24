package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class Fashion_page extends Library {
	seleniumReusable se;
	public Fashion_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="(//div[@class='yQdBY2'])[3]") WebElement Fashionlink;
	@FindBy(xpath="//a[text()='Kids']")WebElement Kidslink;
	@FindBy(xpath="//a[text()='Girls Dresses']") WebElement girlsdresslink;
	@FindBy(xpath="//div[text()='Price -- Low to High']") WebElement pricelowtohigh;
	
	public void movefashionlink() {
		se=new seleniumReusable(driver);
		se.mousehover(Fashionlink);
	}
	public void movekidlink() {
		se.mousehover(Kidslink);
		
	}
	public void clickgirlslink() {
		se.moveelement(girlsdresslink);
	}
	public void clickprice() {
		se.click(pricelowtohigh);
	}

	
}
