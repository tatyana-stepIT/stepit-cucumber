package com.step_it.steps;

import com.step_it.pages.LoginPage;
import com.step_it.pages.MainPage;
import lombok.extern.log4j.Log4j2;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Log4j2
public class CommonSteps {
    private MainPage mainPage;
    private LoginPage loginPage;

    public CommonSteps() {
        mainPage = new MainPage();
        loginPage = new LoginPage();
    }

    public void checkLoginPageIsOpen() {
        assertThat(loginPage.isLogoDisplayed()).as("The login page is not displayed").isTrue();
    }

    public void checkUserLoggedIn() {
        log.info("Check user is logged in");
        assertThat(mainPage.isTitleDisplayed()).as("The title is not displayed").isTrue();
    }
}
