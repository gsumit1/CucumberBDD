package RestWebService;

import static io.restassured.RestAssured.given;

public class TradeResponseClassStep extends RestClass {

	public TradeDetails get_trade_details() {

		return given().spec(secRequest).get("/store").then().extract().as(TradeDetails.class);

	}

}
