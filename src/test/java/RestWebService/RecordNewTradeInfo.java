package RestWebService;

import static io.restassured.RestAssured.given;

public class RecordNewTradeInfo extends RestClass {

	public TradeDetails createRecord(String Security, String buySell, String quanatity, String priceInCent) {
		return new TradeDetails(Security, buySell, quanatity, priceInCent);

	}

	public void send_Post_Request(TradeDetails trade) {

		given().spec(secRequest).body(trade).post("/store");

	}

}
