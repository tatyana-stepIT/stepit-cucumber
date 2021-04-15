package com.step_it.steps;

import com.step_it.pages.ProductPage;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class ProductSteps {
    private ProductPage productPage;

    public void addProductToCart(String product) {
        log.info("Adding product {} to cart", product);
        productPage.addProductToCart(product);
    }

    public void checkPageIsDisplayed() {
        log.info("Check product page is displayed");
        productPage.waitUntilPageDisplayed();
    }
}
