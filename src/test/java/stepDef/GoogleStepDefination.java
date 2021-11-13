package stepDef;

import base.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.GooglePage;
import pageObject.HomePage;

public class GoogleStepDefination extends  Setup{
	
	GooglePage google = new GooglePage(driver);
	
	
	@Given("I am on the Google page")
	public void i_am_on_the_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // google
	    System.out.println("on google page");
	}
	@When("I search {string}")
	public void i_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // google.search(string);
	    
	    System.out.println("Searched:"+string);
	}
	@Then("I should see search result")
	public void i_should_see_search_result() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
