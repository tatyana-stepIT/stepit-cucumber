package com.step_it.step_definitions;

import com.step_it.state_sharing.TestSteps1;
import com.step_it.state_sharing.TestSteps2;
import io.cucumber.java.en.Given;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class SharingStateDefinitions {
    private TestSteps1 testSteps1;
    private TestSteps2 testSteps2;

    @Given("the state is shared")
    public void theStateIsShared(){
        testSteps1.changeState();
        testSteps2.getState();
        testSteps2.changeState();
        testSteps1.getState();
    }
}
