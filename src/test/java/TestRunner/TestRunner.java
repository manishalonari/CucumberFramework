package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features={"AllFeatureFiles1/FacebookLogin.feature"},
		glue={"StepDefination1"},
		dryRun=false
		)
public class TestRunner {

}
