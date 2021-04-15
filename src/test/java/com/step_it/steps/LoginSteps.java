package com.step_it.steps;

import com.step_it.pages.LoginPage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
public class LoginSteps {
    private LoginPage loginPage;

//@AllArgsConstructor generates below code
//    public LoginSteps(LoginPage loginPage) {
//        this.loginPage = loginPage;
//    }

    public void login(String username, String password) {
        log.info("User logs in to app with username: {} and password: {}",
                username, password);
        loginPage.login(username, password);
    }
}
