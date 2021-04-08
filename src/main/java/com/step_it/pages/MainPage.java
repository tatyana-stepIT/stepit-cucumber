package com.step_it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(css = ".header_secondary_container .title")
    private WebElement pageTitle;

    public boolean isTitleDisplayed() {
        return pageTitle.isDisplayed();
    }
}
