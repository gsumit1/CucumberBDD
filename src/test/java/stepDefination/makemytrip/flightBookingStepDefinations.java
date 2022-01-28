package stepDefination.makemytrip;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flightBookingStepDefinations {
	
	@Given("user login to makemytrip using Guest account")
	public void user_login_to_makemytrip_using_guest_account() {
		
		System.out.println("user login selenium implementation");
	   
	}
	@When("the user booking flight with following info")
	public void the_user_booking_flight_with_following_info(io.cucumber.datatable.DataTable dataTable) {
		
		System.out.println("booking flights info selenium implementation");
	    
	}
	@When("user book the cheapest available flight with credit card")
	public void user_book_the_cheapest_available_flight_with_credit_card() {
		
		System.out.println("booking flight using CC  selenium implementation");
	   
	}
	@Then("flight should be booked successfullly")
	public void flight_should_be_booked_successfullly() {
		
		System.out.println("validation booking of flight selenium implementation");
	    
	}

}
