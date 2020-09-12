package stepDefinitions;

import base.CommonAPI;
import getAQuoteAuto.GetAQuoteAuto;
import getAQuoteHome.GetAQuoteHome;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static getAQuoteAuto.GetAQuoteAutoWebElements.*;

public class GetAQuoteAutoStepDefinition extends CommonAPI {


    static GetAQuoteAuto getAQuoteAuto;

    @BeforeStep
    public static void getInit() {
        getAQuoteAuto = PageFactory.initElements(driver, GetAQuoteAuto.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @When("I enter a valid zip code on the Auto Zip Code field")
    public void i_enter_a_valid_zip_code_on_the_auto_zip_code_field() {
        typeOnElementByXpath(zipCodeFieldXpathWebElement, vaZipCode);
    }

    @When("I click on Start Quote button")
    public void i_click_on_start_quote_button() {
        clickOnElementByCSS(startQuoteButtonCSSWebElement);
    }

    @Then("I verify page {string}")
    public void i_verify_page(String text) {
        validateByText(thanksMessageXpathWebElement, text);
    }

    @When("I enter a {string} on `First Name` field")
    public void i_enter_a_on_first_name_field(String firstName) {
        typeOnElementByCSS(whatIsYourFirstNameCSSWebElement, firstName);
    }

    @When("I enter a {string} on `Last Name` field")
    public void i_enter_a_on_last_name_field(String lastName) {
        typeOnElementByCSS(whatIsYourLastNameCSSWebElement, lastName);
    }

    @When("I enter a {string} on the `Street Address` field")
    public void i_enter_a_on_the_street_address_field(String streetAddress) {
        typeOnElementByCSS(whatIsYourStreetAddressCSSWebElement, streetAddress);
    }

    @And("I enter a {string} number on `Apt or Suite` field")
    public void iEnterANumberOnAptOrSuiteField(String aptSuite) {
        typeOnElementByCSS(whatIsYourAptSuiteCSSWebElement, aptSuite);
    }

    @When("I enter a {string} on the `Date of Birth` field")
    public void i_enter_a_on_the_date_of_birth_field(String dateOfBirth) {
        typeOnElementByCSS(whatIsYourDateOfBirthCSSWebElement, dateOfBirth);
    }

    @When("I click on `Next: Add Your Vehicle` button")
    public void i_click_on_next_add_your_vehicle_button() {
        clickOnElementByID(nextAddYourVehiclesIDWebElement);
    }

    @Then("I verify thank you text")
    public void i_verify_thank_you_text() throws InterruptedException {
        sleepFor(3);
        getAQuoteAuto.cancelOrValidateText(thanksText);
    }

}
