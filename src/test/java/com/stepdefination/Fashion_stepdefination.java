package com.stepdefination;

import com.Baseclass.Library;
import com.ResusabilityFunctions.seleniumReusable;
import com.pages.Fashion_page;

import io.cucumber.java.en.*;

public class Fashion_stepdefination extends Library {
	seleniumReusable se;
	Fashion_page fp;
	
	@Given("User to move the fashion link")
	public void user_to_move_the_fashion_link() throws Throwable {
		se=new  seleniumReusable(driver);
		System.out.println("Before link Fashion link");
	    se.gettitle();
	    fp=new Fashion_page(driver);
	    fp.movefashionlink();
	    se.waits();
	}

	@When("curser to move to the Kids link")
	public void curser_to_move_to_the_kids_link() throws Throwable {
		fp.movekidlink();
		se.waits();
	   
	}

	@When("move to girls dress and click")
	public void move_to_girls_dress_and_click() throws Throwable {
		fp.clickgirlslink();
		se.waits();
	}

	@When("click the price high to low link")
	public void click_the_price_high_to_low_link() throws Throwable {
		fp.clickprice();
		se.waits();
	    	}

	@Then("it display the relevant detals and get the title")
	public void it_display_the_relevant_detals_and_get_the_title() {
		System.out.println("After clicking fashion link");
		se.gettitle();
	    
	}



}
