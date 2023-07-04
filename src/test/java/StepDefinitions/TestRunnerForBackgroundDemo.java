package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/BackgroundDemo/BackgroundDemo.feature", glue = {
		"StepDefsForBackgroundDemo" }, monochrome = true, plugin = { "pretty", "html:target/Reports/cucumber-reports.html",
				"json:target/Reports/cucumber-reports .json" })
public class TestRunnerForBackgroundDemo {

}
