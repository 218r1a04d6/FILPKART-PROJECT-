package com.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

  public class searchpage extends Library {
	seleniumReusable se;
	public searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//input[@name='q']")WebElement Searhtext;
	@FindBy(xpath="//html[@lang='en-IN']")WebElement Homepage;
	@FindBy(xpath="//html[@lang='en']")WebElement searchresult;
	@FindBy(xpath = "//div[@class='col col-7-12']")List<WebElement> Entireresult;
	@FindBy(xpath = "(//div[@class='col col-7-12'])[3]")WebElement thirdresult;
	public void Search(String Text) {
		se=new seleniumReusable(driver);
		se.enterValue(Searhtext, Text);
	}
	public void clicksearch() {
		Searhtext.sendKeys(Keys.ENTER);
	}
	public void homescreen() {
		System.out.println(Homepage.isDisplayed());
	}
	public void result() {
		System.out.println(searchresult.isDisplayed());
		System.out.println(driver.getTitle());
	}
	public void printentireresult() {
		se.MultipleGetText(Entireresult);
	}
	
	public void print3result() {
		se.Getvalue(thirdresult);
	}
	
}
