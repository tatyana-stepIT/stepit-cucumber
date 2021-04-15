package com.step_it.step_definitions;

import com.step_it.steps.CommonSteps;
import com.step_it.steps.ProductSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductDefinitions {
    private ProductSteps productSteps;
    private CommonSteps commonSteps;

    @When("the user adds {} to cart")
    public void theUserAddsProductToCart(String product) {
        commonSteps.checkCartEmpty();
        productSteps.addProductToCart(product);
    }

    @Given("the app is on products page")
    public void theAppIsOnProductsPage() {
        productSteps.checkPageIsDisplayed();
    }
}
