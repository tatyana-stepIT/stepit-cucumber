package com.step_it.pages;

import com.step_it.driver.driver.WebDriverManager;
import com.step_it.utils.PropertyReader;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public abstract class BasePage {
    @Getter
    private WebDriver driver;

    public BasePage() {
        driver = WebDriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
