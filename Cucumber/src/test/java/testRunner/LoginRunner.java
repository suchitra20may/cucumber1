package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFile", glue = { "stepDefination" },tags="@data-driven")

public  class LoginRunner{
	

}