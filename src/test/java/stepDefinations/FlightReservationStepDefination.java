package stepDefinations;

import java.util.Map;

import base.Setup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObject.HomePage;
import pageObject.ReservationConfirmationPage;
import pageObject.ReservationPage;

@SuppressWarnings("deprecation")
public class FlightReservationStepDefination extends Setup{
	
	HomePage home = new HomePage(driver);
	ReservationPage reservation = new ReservationPage(driver);
	ReservationConfirmationPage message=new ReservationConfirmationPage(driver);
	
	@When("I search Flight")
	public void i_search_flight(DataTable dataTable) {
		Map<String, String> flights = dataTable.asMap(String.class, String.class);
		home.clickOnFlight();
		reservation.setFromLocation(flights.get("From"));
		reservation.setToLocation(flights.get("To"));
		reservation.clickOnContinue();

	}


	@Then("I should have confirmation message")
	public void i_should_have_confirmation_message() {
		Assert.assertTrue(message.reservationMessage.isDisplayed());
	
	}

}
