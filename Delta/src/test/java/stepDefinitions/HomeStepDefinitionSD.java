package stepDefinitions;
import homeSaumitra.HomePageSD;
import base.CommonAPI;
import homeSaumitra.HomePageSD;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static homeSaumitra.HomeWebElementsSaumitra.*;

public class HomeStepDefinitionSD extends CommonAPI {

    static HomePageSD homepage;

    @BeforeStep
    public static void getInit() {
        homepage = PageFactory.initElements(driver, HomePageSD.class);
    }

    @After
    public void closeBrowser() {
        cleanUp();
    }

    @Given("I am on Delta Homepage")
    public void i_am_on_delta_homepage() throws IOException {
        openBrowser("https://www.delta.com/");
    }


    @When("I click on Check-In")
    public void iClickOnCheckIn() {
        clickOnElementByID(checkInByID);
        
    }

    @And("I click on Confirmation number required and put {int} as value")
    public void iClickOnConfirmationNumberRequiredAndPutAsValue(int arg0) {
        typeOnElement(confirmationNumberByID, "123456");
    }

    @And("I click on From Airport and put JFK as value")
    public void iClickOnFromAirportAndPutJFKAsValue() {
        clickOnElementByClass(fromAirportByClass);
        typeOnElement("search_input", "JFK");
    }

    @Then("I select JFK New York,Kennedy NY")
    public void iSelectJFKNewYorkKennedyNY() {
        clickOnElementByXpath(selectJFKByXPATH);
    }

    @And("I click on radio button to submit")
    public void iClickOnRadioButtonToSubmit() {
        clickOnElementByID(radioButtonByID);
    }

    @Then("I validate it by text")
    public void iValidateItByText() {
        validateByText(validateCheckInByTextID, "Whoops! We're sorry, but we are unable to find a check-in eligible reservation with the information provided.");
    }
}