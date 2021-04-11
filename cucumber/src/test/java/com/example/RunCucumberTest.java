package com.example;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "src/test/resources/feature",
		glue={"com.example"}, 
		plugin = {"html:target/testresults.html","json:target/cucumber-reports/cucumber.json"},
		tags = "",
		monochrome = true,
		dryRun = true,
		strict = true
)
public class RunCucumberTest {

}
