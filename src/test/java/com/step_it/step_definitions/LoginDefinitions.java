package com.step_it.step_definitions;

import com.step_it.steps.LoginSteps;
import io.cucumber.java.en.When;

public class LoginDefinitions {
    private LoginSteps loginSteps;

    public LoginDefinitions() {
        loginSteps = new LoginSteps();
    }

    @When("the user enters correct {word} and {word}")
    public void theUserLogsInToAppWithUsernameAndPassword(String username, String password) {
        loginSteps.login(username, password);
    }
}
