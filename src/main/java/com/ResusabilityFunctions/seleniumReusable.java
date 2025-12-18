package com.ResusabilityFunctions;

import java.io.File;
import java.nio.channels.SelectableChannel;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;

public class seleniumReusable extends Library  {
	Actions act;
	public seleniumReusable(WebDriver driver) {
		this.driver=driver;
		
	}
	public void enterValue(WebElement element ,String text) {
		try {
			element.sendKeys(text);
		}catch (Exception e) {
			System.out.println("no such element exception");
		}
	}
	public void click(WebElement element) {
		try {
			element.click();
		}catch (Exception e) {
			System.out.println("no such element exception");
		}
	}
	public void gettitle() {
		try {
			System.out.println(driver.getTitle());
		}catch (Exception e) {
			System.out.println("no such element exception");
		}
	}
	public void screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		}catch (Exception e) {
			System.out.println("screenshot not found");
		}
	
	}
	public void MultipleGetText(List<WebElement> element) {
		List<WebElement> text =element;
		System.out.println(text.size());
		 for(WebElement textcount: text) {
			 String totallist = textcount.getText();
			 System.out.println("*************************************");
			 System.out.println(totallist);
		 }
	}
	public void Getvalue(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public void dropdown(WebElement element,String text) {
		Select drp=new Select(element);
		drp.selectByValue(text);
	}
	public void scrolldown(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void waits() throws Throwable {
		Thread.sleep(2000);
	}
	public void mousehover(WebElement element) {
		act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void moveelement(WebElement element) {
			act.moveToElement(element).click().perform();
}
}
