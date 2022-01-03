package com.mindtree.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(features = { "src\\test\\resources" }, glue = { "com.mindtree.stepDefinition" }, plugin = { "pretty",
		"html:target/cucumber",
		"json:target/cucumber/cucumber.json" }, dryRun = false, monochrome = true, tags = { "@flight,@login" })

@Listeners({com.mindtree.utility.Listener.class,com.mindtree.utility.SuiteListener.class})
public class TestRunner extends AbstractTestNGCucumberTests{

}
