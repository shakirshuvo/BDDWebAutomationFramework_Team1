package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import signIn.SignIn;

import static signIn.SignInWebElements.*;

public class SignInStepDefinition extends CommonAPI {

    static SignIn signIn;

    @BeforeStep
    public static void getInit() {
        signIn = PageFactory.initElements(driver, SignIn.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @When("I hover over {string} button")
    public void i_hover_over_button(String string) {
        mouseHoverByID(helloSignInIDWebElement);
    }

    @When("I click on {string} button under Hello, Sign in")
    public void i_click_on_button_under_hello_sign_in(String string) {
        clickOnElement(signInMainCSSWebElement);
    }

    @When("I enter an invalid {string} on 'Email \\(phone for mobile accounts) field")
    public void i_enter_an_invalid_on_email_phone_for_mobile_accounts_field(String email) {
        typeOnElementByCSS(emailFieldCSSWebElement, email);
    }

    @When("I click on {string} button below 'Email \\(phone for mobile accounts) field")
    public void i_click_on_button_below_email_phone_for_mobile_accounts_field(String string) {
        clickOnElementByClass(continueButtonAfterEmailClassWebElement);
    }

    @Then("I verify that the {string} is displayed")
    public void i_verify_that_the_is_displayed(String text) {
        validateByTextByClass(alertMessageFullClassWebElement, text);
    }

    @Then("I verify that the {string} or {string} is displayed")
    public void i_verify_that_the_or_is_displayed(String string, String string2) {
        validateByTwoTextByClass(alertMessageFullClassWebElement, string, string2);
    }

    @When("I enter a {string} address on 'Email \\(phone for mobile accounts) field")
    public void i_enter_a_address_on_email_phone_for_mobile_accounts_field(String emailAddress) {
        typeOnElementByCSS(emailFieldCSSWebElement, emailAddress);
    }

    @When("I enter an invalid {string} on the {string} field")
    public void i_enter_an_invalid_on_the_field(String string, String password) {
        typeOnElementByCSS(passwordFieldCSSWebElement, password);
    }

    @When("I enter a valid {string} on the Password field")
    public void i_enter_a_valid_on_the_password_field(String string) throws InterruptedException {
        typeOnElementByCSS(passwordFieldCSSWebElement, password);
        sleepFor(2);
    }

    @When("I enter a valid {string} on 'Email \\(phone for mobile accounts) field")
    public void i_enter_a_valid_on_email_phone_for_mobile_accounts_field(String emailAddress) throws InterruptedException {
        typeOnElementByCSS(emailFieldCSSWebElement, emailAddress);
        sleepFor(2);
    }

    @When("I enter an invalid password on the {string} field")
    public void i_enter_an_invalid_password_on_the_field(String string) {
        typeOnElementByCSS(passwordFieldCSSWebElement, invalidPassword);
    }

    @When("I click on {string} button after password")
    public void i_click_on_button_after_password(String string) {
        clickOnElementByID(signInAfterPasswordIDWebElement);
    }

    @Then("I verify that {string} is displayed")
    public void i_verify_that_is_displayed(String string) {
       validateByText(shakirsAmazonTextXpathWebElement, string);
    }

}
