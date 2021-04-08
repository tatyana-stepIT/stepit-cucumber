package com.step_it.steps;

import com.step_it.enums.Color;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Then;

public class DemoSteps {
    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color) {  // type, name (from method)
        return Color.valueOf(color);   // transformer function
    }

    @Then("I have a {color} ball")
    public void iHaveAColorBall(Color color) {
    }
}
