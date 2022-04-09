package runner;

import org.junit.AfterClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDef", plugin = { "pretty",
		"html:target/cucumber-reports.html", "json:target/cucumber.json",
		}, tags = "@Demo")

public class TestRunner {
	@AfterClass
	public static void sendEmail() {

		System.out.println("Send Email of execution");
		
	}
}