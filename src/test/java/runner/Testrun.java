package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/Movie.feature",
		glue="stepDefinitions",
		dryRun =false,
		monochrome =true,
		plugin= {"pretty","html:test-output"}
		//plugin= {"pretty","Json:target/JSONReports"}
		)

public class Testrun {

}
