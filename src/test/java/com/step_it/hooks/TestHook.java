package com.step_it.hooks;


import com.step_it.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.step_it.driver.driver.WebDriverManager.getDriver;
import static com.step_it.driver.driver.WebDriverManager.quitDriver;


@Log4j2
@AllArgsConstructor
public class TestHook {

    @Before(order = 0)
    public void setup(Scenario scenario) {
        log.info("Starting scenario: {}", scenario.getName());
        log.info("Scenario tag {}", scenario.getSourceTagNames());
        log.info("Opening the application login page");
        getDriver().get(PropertyReader.getConfigProperty("url"));
    }

    @Before(order = 1)
    public void secondSetup(Scenario scenario) {
        log.info("I am second");
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed");
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        log.info("Finished scenario: {}", scenario.getName());
        quitDriver();
    }
}