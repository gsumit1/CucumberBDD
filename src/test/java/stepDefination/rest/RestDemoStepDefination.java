package stepDefination.rest;

import java.util.List;
import java.util.Map;

import RestWebService.RecordNewTradeInfo;
import RestWebService.TradeDetails;
import RestWebService.TradeResponseClassStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class RestDemoStepDefination {

	RecordNewTradeInfo recordNewTradeInfo;
	TradeResponseClassStep tradeResponseClassStep;
	TradeDetails trade;

	@Given("the following trade:")
	public void the_following_trade(List<Map<String, String>> tradeDetails) {
		recordNewTradeInfo = new RecordNewTradeInfo();
		trade = new TradeDetails();

		String security = tradeDetails.get(0).get("security");
		String buySell = tradeDetails.get(0).get("buySell");
		String quantity = tradeDetails.get(0).get("quantity");
		String priceInCents = tradeDetails.get(0).get("priceInCents");
		
		
		System.out.println(security+buySell+quantity+priceInCents);
		trade = recordNewTradeInfo.createRecord(security, buySell, quantity, priceInCents);

	}

	@When("I record the trade")
	public void i_record_the_trade() {
		recordNewTradeInfo.send_Post_Request(trade);
	}

	@Then("the recorded trade should include the following details:")
	public void the_recorded_trade_should_include_the_following_details(List<Map<String, String>> tradeDetails) {
		tradeResponseClassStep=new TradeResponseClassStep();
		Map<String, String> expectedTradeResults = tradeDetails.get(0);
		TradeDetails actualResult = tradeResponseClassStep.get_trade_details();
		assertEquals(actualResult.getSecurity(), expectedTradeResults.get("security"));
		assertEquals(actualResult.getBuySell(), expectedTradeResults.get("buySell"));
	}

}
