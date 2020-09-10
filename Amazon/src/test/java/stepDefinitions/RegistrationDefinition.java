package stepDefinitions;

import base.CommonAPI;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import registration.RegistrationPage;

import static registration.RegistrationWebElements.*;

public class RegistrationDefinition extends CommonAPI {

    static RegistrationPage registrationPage;

    @BeforeStep
    public static void getInit() {
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @When("I click on {string} link on homepage")
    public void i_click_on_link_on_homepage(String title) {
        System.out.println(title);
        clickOnElement(startHereXPathWebElement);
    }

    @Then("I verify page {string}")
    public void i_verify_page_as(String title) {
        validateByTitle(title);
    }

    @When("I enter a random email address in the {string} field")
    public void i_enter_a_random_email_address_in_the_field(String string) {
        typeByCss(yourEmailFieldCSSWebElement, randomEmail);
    }

    @When("I enter a random password in the {string} field")
    public void i_enter_a_random_password_in_the_field(String string) {
        typeByCss(passwordFieldCSSWebElement, randomPasswordLength6to8);
    }

    @When("I Re-enter the password in the `Re-enter password` field")
    public void i_re_enter_the_password_in_the_re_enter_password_field() {
        typeByCss(passwordReEnterFieldCSSWebElement, randomPasswordLength6to8);
    }

    @When("I click on {string} button on the Registration page")
    public void i_click_on_button_on_the_registration_page(String string) {
        clickOnElementByCSS(createYourAmazonAccountButtonCSSWebElement);
    }

    @Then("I verify {string} alert is displayed under `Your name` field")
    public void i_verify_alert_is_displayed_under_your_name_field(String Namealert) {
        validateByTextByID(enterYourNameAlertIDWebElement, Namealert);
    }

    @When("I enter a random {string}")
    public void i_enter_a_random(String string) {
        typeByCss(yourNameFieldCSSWebElement, randomName);
    }

    @Then("I verify {string} alert is displayed under `Email` field")
    public void i_verify_alert_is_displayed_under_email_field(String emailAlert) {
        validateByTextByID(enterYourEmailAlertIDWebElement, emailAlert);
    }

    @When("I enter an {string} address in the `Email` field")
    public void i_enter_an_address_in_the_email_field(String invalidEmail) {
        typeByCss(yourEmailFieldCSSWebElement, invalidEmail);
    }

    @Then("I verify {string} is displayed under `Email` field")
    public void i_verify_is_displayed_under_email_field(String alert) {
        validateByTextByID(enterAValidEmailAddressAlertIDWebElement, alert);
    }

    @Then("I verify {string} is displayed under `Password` field")
    public void i_verify_is_displayed_under_password_field(String alert) {
        validateByTextByID(enterYourPasswordAlertIDWebElement, alert);
    }

    @Then("I verify {string} is displayed under `Re-Enter password` field")
    public void i_verify_is_displayed_under_re_enter_password_field(String alert) {
        validateByTextByID(typeYourPasswordAgainIDWebElement, alert);
    }

    @When("I enter a random five character long password in the {string} field")
    public void i_enter_a_random_five_character_long_password_in_the_field(String string) {
        typeByCss(passwordFieldCSSWebElement, randomPasswordLength4to5);
    }

    @Then("I verify {string} is displayed under `Password` field for not meeting the password criteria")
    public void i_verify_is_displayed_under_password_field_for_not_meeting_the_password_criteria(String alert) {
        validateByTextByID(passwordMustBeAtLeast6CharacterAlertIDWebElement, alert);
    }
}
