package com.cucumberRuner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/features/",glue={"stepDefinition"},
//    		plugin = { "pretty", "html:target/cucumber-reports" },
//    		monochrome = true)

plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})
public class Runnertest {
	

}
