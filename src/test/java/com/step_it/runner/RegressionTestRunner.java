package com.step_it.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/login"},
        glue = {"com.step_it.step_definitions", "com.step_it.hooks"},
        monochrome = false,
        tags = "@Regression",
        plugin = {"pretty",
                "json:test-output/cucumber-reports/Cucumber.json",
                "junit:test-output/cucumber-reports/Cucumber.xml",
                "html:test-output/cucumber-reports/Cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                }
)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {

}
