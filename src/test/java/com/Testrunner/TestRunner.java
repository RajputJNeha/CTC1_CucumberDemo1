package com.Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
	    features = "src/test/resource/Feature99",
	   // glue = {"com.stepDefinitionTestNG", "com.hooks"},
	    		 glue = {"step_definitions"},
	    				 plugin = {
	    						    "pretty",
	    						    "html:target/Cucumber.html",
	    						    "json:target/cucumber.json",
	    						    "junit:target/cucumber.xml"
	    						   // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    						},
	    monochrome = true
	  //  tags = "@Logoutpass"
	)
 
 
	public class TestRunner extends AbstractTestNGCucumberTests {
		
		
	}



