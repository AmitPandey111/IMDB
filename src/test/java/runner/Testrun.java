package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\amitp\\eclipse-workspace\\Movie_Cucumber\\Features",
		glue="stepDefinitions",
		dryRun =false,
		monochrome =true,
		plugin= {"pretty","html:test-output"}
		//plugin= {"pretty","Json:target/JSONReports"}
		)

public class Testrun {

}
