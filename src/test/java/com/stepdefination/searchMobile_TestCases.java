package com.stepdefination;

import java.io.IOException;

import com.Baseclass.Library;
import com.pages.searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchMobile_TestCases  extends Library{
	public searchpage sp;
	@Given("Launch the Flipkart application")
	public void launch_the_flipkart_application() throws IOException {
		launchapplication();
	} 

	@When("close the popup")
	public void close_the_popup() {
	    System.out.println(driver.getTitle());
	}

	@Then("It should navigate to home page")
	public void it_should_navigate_to_home_page() {
	   sp=new searchpage(driver);
	   sp.homescreen();
	}
	@Given("user enter the text in the search field")
	public void user_enter_the_text_in_the_search_field() {
		sp.Search("Mobile");	   
	}
	@When("clicks the search button")
	public void clicks_the_search_button() {
	 sp.clicksearch();
	}

	@Then("It should navigate to the search result page and display the relevent details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevent_details() {
	   sp.result();
	}

@Then("Extract the results and print in console")
public void extract_the_results_and_print_in_console() {
	sp.print3result();
	System.out.println("*********************************");
    
}

@Then("Print the third result and keep it in console")
public void print_the_third_result_and_keep_it_in_console() {
    sp.printentireresult();
}


	}

