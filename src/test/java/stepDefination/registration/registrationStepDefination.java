package stepDefination.registration;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import pageObject.RegistrationSuccess;

public class registrationStepDefination extends Setup {
	HomePage home = new HomePage(driver);
	RegistrationPage reg = new RegistrationPage(driver);
	RegistrationSuccess regSuccess = new RegistrationSuccess(driver);

	@Given("I am on travel portal")
	public void i_am_on_travel_portal() {
		
		home.clickOnRegistration();
		
	}

	@When("I register with details")
	public void i_register_with_details(DataTable dataTable) {
		Map<String, String> userDetails = dataTable.asMap(String.class, String.class);
		reg.register_user(userDetails);
	}

	@Then("I should be successfully register")
	public void i_should_be_successfully_register() {
		assertTrue("Fail to register user", regSuccess.successMessage.isDisplayed());

	}
	
	
	@When("I register with {string} {string} {string}")
	public void i_register_with(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);
	    System.out.println(string3);
	    
		Map<String, String> userDetails=new HashMap<String,String>();
		userDetails.put("UserName", string);
		userDetails.put("Password", string2);
		userDetails.put("Confirm Password", string3);
		reg.register_user(userDetails);
	
	    
	    
	    
	    
	    
	    
	}
	
	

}
