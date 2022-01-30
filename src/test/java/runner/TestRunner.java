package runner;

import org.junit.AfterClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./features", glue = "stepDefination", plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber.json",
		}, tags = "@RestDemo")

public class TestRunner {
	@AfterClass
	public static void sendEmail() {

		System.out.println("Send Email of execution");
		
	}
}

//src/test/java/features