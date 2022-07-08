package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/features/Feature_OneWayTrip.feature",
		glue = {"com.stepdef"},
		format = {"pretty", "html:htmlreports", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true
		)

public class TestRunner {

}
