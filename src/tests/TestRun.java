package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/feature", //location of the feature folder containing files with *.feature extension
		//since feature is under a package we should specify src/feature
		glue = { "stepdefinition" }) //location of step definition files

public class TestRun {

}
