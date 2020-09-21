package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static cart.CartWebElements.*;

public class CartStepDefinition extends CommonAPI {

    @When("I click on the product {string}")
    public void i_click_on_the_product(String string) {
        clickOnElement(wd5TBPassportXpathWebElement);
    }

    @When("I click on {string}")
    public void i_click_on(String string) throws InterruptedException {
        sleepFor(1);
        clickOnElementByID(addToCartIDWebElement);
    }

    @Then("I verify that the item has been added with {string} text")
    public void i_verify_that_the_item_has_been_added_with_text(String string) {
        elementIsDisplayed(addedToCartVerificationIDWebElement);
    }

    @When("I click on cart button")
    public void i_click_on_cart_button() {
        clickOnElementByID(cartIDWebElement);
    }

    @Then("I verify that the item has been added by confirming that the item is displayed in the cart")
    public void i_verify_that_the_item_has_been_added_by_confirming_that_the_item_is_displayed_in_the_cart() {
        elementIsDisplayed(wd5TBPassportXpathWebElement);
    }

    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        clickOnElement(deleteButtonXpathWebElement);
    }

    @Then("I verify that the the text {string} is displayed")
    public void i_verify_that_the_the_text_is_displayed(String string) {
        elementIsDisplayed(yourAmazonCartIsEmptyXpathWebElement);
    }

    @When("I navigate back to previous window.")
    public void i_navigate_back_to_previous_window() {
        navigateBack();
    }


    @Then("I verify that for Subtotal {string} is displayed")
    public void iVerifyThatForSubtotalIsDisplayed(String arg0) {
        validateByText(subtotalIDWebElement, "Subtotal (2 items):");
    }
}
