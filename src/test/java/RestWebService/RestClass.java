package RestWebService;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RestClass {

	RequestSpecification secRequest;

	RestClass() {

		String url = "http://localhost:3000";
		secRequest = new RequestSpecBuilder().setContentType("application/json")
				.addHeader("Content-Type", "application/json").setBaseUri(url).build();

	}

}
