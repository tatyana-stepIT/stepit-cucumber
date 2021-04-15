package com.step_it.pages;

import com.step_it.driver.driver.WebDriverManager;
import com.step_it.utils.PageLoader;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    @Getter
    private WebDriver driver;

    @Getter
    private PageLoader pageLoader;

    public BasePage() {
        driver = WebDriverManager.getDriver();
        pageLoader = new PageLoader(driver);
        PageFactory.initElements(driver, this);
    }
}
