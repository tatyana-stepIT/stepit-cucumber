package com.step_it.steps;

import com.step_it.pages.LoginPage;
import com.step_it.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.AssertionsForClassTypes;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Log4j2
@AllArgsConstructor
public class CommonSteps {
    private MainPage mainPage;
    private LoginPage loginPage;

//@AllArgsConstructor generates below code --boilerplate
//    public CommonSteps(MainPage mainPage, LoginPage loginPage) {
//        this.mainPage = mainPage;
//        this.loginPage = loginPage;
//    }

    public void checkLoginPageIsOpen() {
        log.info("Check login page is open");
        assertThat(loginPage.isLogoDisplayed()).as("The login page is not displayed").isTrue();
    }

    public void checkUserLoggedIn() {
        log.info("Check user is logged in");
        assertThat(mainPage.isTitleDisplayed()).as("The title is not displayed").isTrue();
    }

    public void checkCartEmpty() {
        log.info("Check cart is empty");
        checkCartCounter(0, "The cart is not empty");
    }

    public void checkCartCounterUpdated(int counter) {
        log.info("Check cart counter is updated");
        checkCartCounter(counter, "The counter was not updated");
    }

    private void checkCartCounter(int counter, String assertionMessage) {
        assertThat(mainPage.getProductCountsInCart()).as(assertionMessage).isEqualTo(counter);
    }
}
