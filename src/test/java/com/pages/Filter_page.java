package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;

public class Filter_page extends Library{
	seleniumReusable se;
	public Filter_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//select[@class='hbnjE2'])[1]")WebElement MinimumAmount;
	@FindBy (xpath="(//select[@class='hbnjE2'])[2]")WebElement MaximumAmount;
	@FindBy(xpath="//div[text()='vivo']")WebElement Brand;
	@FindBy(xpath="//div[text()='4 GB']")WebElement Ram;
	@FindBy(xpath="//div[text()='Battery Capacity']") WebElement BatteryRow;
	@FindBy(xpath="//div[text()='3000 - 3999 mAh']")WebElement BatteryCapacity;
	
	public void Min() {
		se=new seleniumReusable(driver);
		se.dropdown(MinimumAmount, "10000");
		
	}
	public void max() {
		se=new seleniumReusable(driver);
		se.dropdown(MaximumAmount, "20000");
	}
	public void brand() {
		se=new seleniumReusable(driver);
		se.click(Brand);
	}
	public void ram() {
		se=new seleniumReusable(driver);
		se.click(Ram);
	}
	public void clickbattery() {
		se=new seleniumReusable(driver);
		se.click(BatteryRow);
		se.click(BatteryCapacity);
	}
}
