package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/home.feature",glue= {"stepdefinations"}, monochrome = true,
plugin ={"pretty","html:test-output"},dryRun = false
)


public class Runner {

}
